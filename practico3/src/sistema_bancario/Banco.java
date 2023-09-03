package sistema_bancario;
import sistema_bancario.Cliente;

import java.util.List;

public class Banco {

    private List<Cliente> clientes;

    public Banco() {
        this.clientes = null;
    }

    public Banco(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Cliente getCliente(String dni){
        for (Cliente c: this.clientes) {
            if (c.getDni().equals(dni))
                return c;
        }
        return null;
    }

    public void agregarCliente(Cliente c){
        this.clientes.add(c);
    }

    public void eliminarCuenta(String dni, String nCuneta){
        for (Cliente c: this.clientes) {
            if (c.getDni().equals(dni)){
                c.eliminarCuentaPorNumero(nCuneta);
            }

        }
    }
}
