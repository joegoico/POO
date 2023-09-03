package AgendaCelular;

import Agenda.Persona;
public class Contacto extends Persona {
    public Contacto(){
        super();
    }

    private String direccion;

    private String ciudadOrigen;

    public Contacto(String nombre, String telefono, String email, int edad, String direccion, String ciudadOrigen) {
        super(nombre, telefono, email, edad);
        this.direccion = direccion;
        this.ciudadOrigen = ciudadOrigen;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudadOrigen() {
        return ciudadOrigen;
    }

    public void setCiudadOrigen(String ciudadOrigen) {
        this.ciudadOrigen = ciudadOrigen;
    }


}

