package Series;

import java.util.ArrayList;
import Series.Episodio;
public class Temporada {

    private int numTemporada;

    private boolean vista=false;

    private ArrayList<Episodio> episodios;

    public Temporada(int num, ArrayList episodios){
        this.numTemporada=num;
        this.episodios=episodios;
    }

    public int getNumTemporada() {
        return numTemporada;
    }

    public ArrayList getEpisodios() {
        return episodios;
    }

    public boolean isVista() {
        return vista;
    }

    public void setNumTemporada(int numTemporada) {
        this.numTemporada = numTemporada;
    }

    public void setEpisodios(String titulo, String descripcion, boolean visto, int valoracion){
        Episodio epi = new Episodio(titulo, descripcion, visto, valoracion);
        this.episodios.add(epi);
    }

    public void setVista(boolean vista) {
        this.vista = vista;
    }

    public boolean confirmarVista(){
        for (Episodio e: episodios) {
            if(e.isVisto()){
                this.vista=true;
            }
            else{
                this.vista=false;
                break;
            }
        }
        return this.vista;
    }
    public int episodiosVistos() {
        int contador = 0;
        for (Episodio e : this.episodios) {
            if (e.isVisto()) {
                contador++;
            }
        }
        return contador;
    }

    public double calificacionPromedio(){
        int contador = 0;
        float calificaciones = 0;
        for (Episodio e: this.episodios) {
            if (e.isVisto()) {
                contador++;
                calificaciones +=e.getValoracion();
            }
        }
        return calificaciones/contador;
    }

}
