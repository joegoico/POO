package Coleccion;

public class Objeto<T> {

    private T dato;
    private int escritura;

    private int lectura;

    public Objeto() {
        this.escritura=0;
        this.lectura=0;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public int getEscritura() {
        return escritura;
    }

    public void setEscritura() {
        this.escritura += 1;
    }

    public int getLectura() {
        return lectura;
    }

    public void setLectura() {
        this.lectura += 1;
    }
}
