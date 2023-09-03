package Coleccion;
import java.util.ArrayList;
import java.util.List;
import Coleccion.Objeto;

public class Coleccion<T extends Objeto> {
    private List<T> elementos;



    public Coleccion() {
        elementos = (List<T>) new ArrayList<T>();
    }

    public void agregar(T elemento) {
        elemento.setEscritura();
        elementos.add(elemento);
    }

    public Objeto obtener(int indice) {
        if (indice < 0 || indice >= elementos.size()) {
            throw new IndexOutOfBoundsException("Índice fuera de rango");
        }
        T elemento =elementos.get(indice);
        elemento.setLectura();
        return elemento;
    }

    public int tamaño() {
        return elementos.size();
    }
}