package sistema_bancario;
import sistema_bancario.CajaDeAhorro;

import java.util.List;

public class Persona {
    private  String nombre;

    private String telefono;

    private String email;

    private int edad;

    public Persona() {
    }

    public Persona(String nombre, String telefono, String email, int edad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
