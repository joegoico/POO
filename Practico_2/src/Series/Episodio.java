package Series;

public class Episodio {

    private String titulo;

    private String descripcion;

    private boolean visto= false;

    private int valoracion = -1;

    public Episodio(String titulo, String descripcion, boolean visto, int valoracion){
        this.descripcion=descripcion;
        this.titulo=titulo;
        this.valoracion=valoracion;
        this.visto=visto;
    }

    public boolean isVisto() {
        return visto;
    }

    public int getValoracion() {
        return valoracion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setValoracion(int valoracion) {
        this.valoracion = valoracion;
    }

    public void setVisto(boolean visto) {
        this.visto = visto;
    }
}
