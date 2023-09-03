package sistema_bancario;

public class CajaDeAhorro {

    private  int saldoDisponible;

    private String numCuenta;

    public CajaDeAhorro(int saldoDisponible, String numCuenta) {
        this.saldoDisponible = saldoDisponible;
        this.numCuenta = numCuenta;
    }

    public int getSaldoDisponible() {
        return saldoDisponible;
    }

    public void setSaldoDisponible(int saldoDisponible) {
        this.saldoDisponible = saldoDisponible;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public void depositar(int dinero){
        this.saldoDisponible+=dinero;
    }

    public  boolean sePuedeExtarer(int dinero){
        return (this.saldoDisponible - dinero>=0);
    }

    public void extarer(int dinero){
        if (sePuedeExtarer(dinero))
            this.saldoDisponible-=dinero;
    }
}
