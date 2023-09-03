package practico2;

import java.time.LocalDate;
import java.time.Period;

public class Persona {
    LocalDate fechaNacimiento;
    private  String nombre;
    private int edad;

    private  long dni;

    private boolean sexo ;//es true si es femenino

    private int peso;

    private double altura ;

    public Persona(long dni){
        this.dni=dni;
        this.nombre="N";
        this.fechaNacimiento = LocalDate.of(2000, 1, 1);
        this.altura = 1.0;
        this.peso=1;
        this.edad=1;
        this.sexo = true;
    }

    public Persona(long dni, String n,int a,int m,int d, double h, int p,int e){
        this.dni=dni;
        setNombre(n);
        setAltura(h);
        setPeso(p);
        setFecha(a,m,d);
        setEdad(e);
    }

    public LocalDate getFecha() {
        return fechaNacimiento;
    }

    public boolean isSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public int getEdad() {
        return edad;
    }

    public int getPeso() {
        return peso;
    }

    public long getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public void setSexo(boolean sexo) {
        this.sexo = sexo;
    }

    public void setFecha(int anio, int mes, int dia) {
        LocalDate nuevaFecha = LocalDate.of(anio,mes,dia);
        this.fechaNacimiento = nuevaFecha;
    }

    public double masaCorporal(){
        double denominador = this.altura;
        int p = getPeso();
        return (p/(denominador*denominador));
    }

    public boolean estaEnForma(){
        return masaCorporal() < 25 && masaCorporal() > 18.5;
    }

    public boolean cumpleaños(){
        boolean cumple = false;
        LocalDate nuevaFecha = LocalDate.now();
        if (nuevaFecha.equals(this.fechaNacimiento))
            cumple = true;
        return  cumple;
    }

    public boolean  esMayor(int mayorQue){
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(this.fechaNacimiento, fechaActual);
        return periodo.getYears() >= mayorQue;
    }

    public boolean  esCoerente(){
        LocalDate fechaActual = LocalDate.now();
        Period periodo = Period.between(this.fechaNacimiento, fechaActual);
        return periodo.getYears() == this.edad;
    }

    public String obtenerDatos() {
        String datos = "Nombre: " + this.nombre +
                "\nFecha de Nacimiento: " + this.fechaNacimiento +
                "\nEdad: " + this.edad +
                "\nDNI: " + this.dni +
                "\nSexo: " + (this.sexo ? "Femenino" : "Masculino") +
                "\nPeso: " + this.peso + " kg" +
                "\nAltura: " + this.altura + " m";
        return datos;
    }
}
