package practico2;

public class Electrodomestico {
    private  String nombre;

    private long precioBase;

    private String color;

    private  int consumoEnergetico;

    private int peso;

    public Electrodomestico(){
        this.nombre = "N";
        this.color = "Gris Plata";
        this.consumoEnergetico = 10;
        this.precioBase = 100;
        this.peso = 2;
    }

    public Electrodomestico(String n){
        this.nombre = n;
        this.color = "Gris Plata";
        this.consumoEnergetico = 10;
        this.precioBase = 100;
        this.peso = 2;
    }

    public Electrodomestico(String n, String c){
        this.nombre = n;
        this.color = c;
        this.consumoEnergetico = 10;
        this.precioBase = 100;
        this.peso = 2;
    }

    public Electrodomestico(String n, String c, int cons){
        this.nombre = n;
        this.color = c;
        this.consumoEnergetico = cons;
        this.precioBase = 100;
        this.peso = 2;
    }

    public Electrodomestico(String n, String c, int cons, int pr){
        this.nombre = n;
        this.color = c;
        this.consumoEnergetico = cons;
        this.precioBase = pr;
        this.peso = 2;
    }

    public Electrodomestico(String n, String c, int cons, int pr, int ps) {
        this.nombre = n;
        this.color = c;
        this.consumoEnergetico = cons;
        this.precioBase = pr;
        this.peso = ps;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }

    public int getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public long getPrecioBase() {
        return precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumoEnergetico(int consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public void setPrecioBase(long precioBase) {
        this.precioBase = precioBase;
    }

    public boolean esBajoConsumo(int consumo){
        return this.consumoEnergetico<consumo;
    }

    public double balance(){
        return precioBase/peso;
    }

    public boolean esAltaGama(){
        return this.balance()>3;
    }
}
