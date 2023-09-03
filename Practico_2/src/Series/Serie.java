package Series;

import java.util.ArrayList;
import Series.Temporada;
public class Serie {

    private String titulo;

    private String descripcion;

    private String creador;

    private String genero;

    private boolean vista=false;

    private ArrayList<Temporada> temporadas;

    public Serie(String titulo, String descripcion, String creador, String genero){
        this.creador=creador;
        this.genero=genero;
        this.descripcion=descripcion;
        this.titulo=titulo;
    }
    public String getDescripcion() {
        return descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getCreador() {
        return creador;
    }

    public String getGenero() {
        return genero;
    }

    public boolean isVista() {
        return vista;
    }

    public double getValoracionTemporada(int numTemporada){
        double valoracion = 0.0;
        for (Temporada temp: temporadas) {
            if (temp.getNumTemporada()==numTemporada){
               valoracion= temp.calificacionPromedio();
               break;
            }
        }
        return valoracion;
    }

    public double valoracionSerie(){
        double valoracion = 0.0;
        for (int i = 0; i<temporadas.size(); i++){
            Temporada temp = temporadas.get(i);
            valoracion +=temp.calificacionPromedio();
        }
        return valoracion/temporadas.size();
    }

    public boolean isVsita() {
        for (Temporada temp: temporadas) {
            if(temp.confirmarVista()){
                this.vista=true;
            }else {
                this.vista=false;
                break;
            }
        }
        return this.vista;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
