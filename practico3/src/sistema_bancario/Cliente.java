package sistema_bancario;

import java.util.Iterator;
import java.util.List;
import sistema_bancario.CajaDeAhorro;

public class Cliente extends Persona {
    private String dni;

    private List<CajaDeAhorro> cuentas;

    public Cliente(String dni) {
        super();
        this.dni = dni;
    }

    public Cliente(String nombre, String telefono, String email, int edad, String dni1, List<CajaDeAhorro> cuentas) {
        super(nombre, telefono, email, edad);
        this.dni = dni1;
        this.cuentas = cuentas;
    }

    public Cliente(String nombre, String telefono, String email, int edad, String dni1) {
        super(nombre, telefono, email, edad);
        this.dni = dni1;
    }

    public Cliente(String dni, List<CajaDeAhorro> cuentas) {
        super();
        this.dni = dni;
        this.cuentas = cuentas;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public CajaDeAhorro buscarCuentaPorNumero(String numeroCuenta) {
        for (CajaDeAhorro cuenta : this.cuentas) {
            if (cuenta.getNumCuenta().equals(numeroCuenta)) {
                return cuenta; // Se encontró la cuenta, la devolvemos
            }
        }
        // Si no se encontró la cuenta, puedes devolver null o lanzar una excepción, según tu preferencia.
        return null; // Opcionalmente, puedes devolver null si no se encuentra la cuenta.
    }

    public void agregarCuenta(CajaDeAhorro cuenta){
        this.cuentas.add(cuenta);
    }

    public void setCuentas(List<CajaDeAhorro> cuentas) {
        this.cuentas = cuentas;
    }

    public void eliminarCuentaPorNumero(String numeroCuenta) {
        Iterator<CajaDeAhorro> iterador = this.cuentas.iterator();
        while (iterador.hasNext()) {
            CajaDeAhorro cuenta = iterador.next();
            if (cuenta.getNumCuenta().equals(numeroCuenta)) {
                iterador.remove(); // Eliminamos la cuenta de la lista
                return; // Terminamos la función después de eliminar la cuenta
            }
        }
        // Si no se encontró la cuenta, puedes lanzar una excepción o manejar el caso según tu preferencia.
    }

}
