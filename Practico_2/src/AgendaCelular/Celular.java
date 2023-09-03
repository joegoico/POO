package AgendaCelular;

import AgendaCelular.Contacto;
import Agenda.Persona;
import java.util.ArrayList;

public class Celular {

    private ArrayList<Contacto> contatcos;

    private Persona usuario;

    public Celular(ArrayList<Contacto> contatcos, Persona usuario) {
        this.contatcos = contatcos;
        this.usuario = usuario;
    }

    public Celular(ArrayList<Contacto> contatcos) {
        this.contatcos = contatcos;
    }

    public Celular() {

    }

    public ArrayList<Contacto> getContatcos() {
        return contatcos;
    }

    public void setContatcos(ArrayList<Contacto> contatcos) {
        this.contatcos = contatcos;
    }

    public Persona getUsuario() {
        return usuario;
    }

    public void setUsuario(Persona usuario) {
        this.usuario = usuario;
    }

    public String infoContacto(Contacto c){
        return "Nombre: " + c.getNombre() +
                "\nTeléfono: " + c.getTelefono() +
                "\nEmail: " + c.getEmail() +
                "\nEdad: " + c.getEdad() +
                "\nDirección: " + c.getDireccion() +
                "\nCiudad de Origen: " + c.getCiudadOrigen();
    }

    public void agregarContatco(Contacto c){
        this.contatcos.add(c);
    }

    public String listarContactos() {
        StringBuilder lista = new StringBuilder(); // Para acumular la información de los contactos

        for (Contacto c : contatcos) {
            lista.append(this.infoContacto(c)).append("\n");
        }

        return lista.toString();
    }

}
