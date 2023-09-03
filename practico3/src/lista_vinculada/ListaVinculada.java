package lista_vinculada;

import lista_vinculada.Nodo;
public class ListaVinculada<T> {
    private Nodo<T> cabeza;

    public ListaVinculada() {
        this.cabeza = null;
    }

    public void agregar(T dato) {
        Nodo<T> nuevoNodo = new Nodo<>(dato);
        if (cabeza == null) {
            cabeza = nuevoNodo;
        } else {
            Nodo<T> nodoActual = cabeza;
            while (nodoActual.getSiguiente() != null) {
                nodoActual = nodoActual.getSiguiente();
            }
            nodoActual.setSiguiente(nuevoNodo);
        }
    }

    public void imprimir() {
        Nodo<T> nodoActual = cabeza;
        while (nodoActual != null) {
            System.out.print(nodoActual.getDato() + " ");
            nodoActual = nodoActual.getSiguiente();
        }
        System.out.println();
    }
}
