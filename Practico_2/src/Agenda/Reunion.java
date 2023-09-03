package Agenda;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import Agenda.Persona;

public class Reunion {

    private String lugar;

    private String tematica;

    private int duracion;

    private LocalTime horarioInicio;

    private LocalTime horarioFin;

    public Reunion(String lugar, String tematica, int duracion, ArrayList<Persona> participantes, LocalDate fecha) {
        this.lugar = lugar;
        this.tematica = tematica;
        this.duracion = duracion;
        this.participantes = participantes;
        this.fecha = fecha;
    }

    private ArrayList<Persona> participantes;

    private LocalDate fecha;

    public String getLugar() {
        return lugar;
    }

    public String getTematica() {
        return tematica;
    }

    public int getDuracion() {
        return duracion;
    }

    public ArrayList<Persona> getParticipantes() {
        return participantes;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public LocalTime getHorarioInicio() {
        return horarioInicio;
    }

    public LocalTime getHorarioFin() {
        return horarioFin;
    }

    public void setHorarioFin(LocalTime horarioFin) {
        this.horarioFin = horarioFin;
    }

    public void setHorarioInicio(LocalTime horarioInicio) {
        this.horarioInicio = horarioInicio;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setParticipantes(ArrayList<Persona> participantes) {
        this.participantes = participantes;
    }

    public void setTematica(String tematica) {
        this.tematica = tematica;
    }

    public void eliminarParticipante(Persona p){
        this.participantes.remove(p);
    }

    public void agregarParticipante(Persona p){
        this.participantes.add(p);
    }

    public  boolean seSuperpone(Reunion r){
        LocalTime horarioFin = horarioInicio.plusMinutes(duracion);
        LocalTime otraHorarioFin = r.horarioInicio.plusMinutes(r.duracion);

        return (horarioInicio.isBefore(otraHorarioFin) && horarioFin.isAfter(r.horarioInicio))
                || (r.horarioInicio.isBefore(horarioFin) && otraHorarioFin.isAfter(horarioInicio));
    }
}
