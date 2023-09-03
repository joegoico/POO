package Agenda;

import java.time.LocalTime;
import java.util.ArrayList;
import Agenda.Reunion;
import Agenda.Persona;
public class AgendaPersonal {

    private LocalTime horario;

    private ArrayList<Reunion> reuniones;

    private Persona usuario;

    public AgendaPersonal(LocalTime horario, ArrayList<Reunion> reuniones, Persona usuario) {
        this.horario = horario;
        this.reuniones = reuniones;
        this.usuario = usuario;
    }

    public LocalTime getHorario() {
        return horario;
    }

    public void setHorario(LocalTime horario) {
        this.horario = horario;
    }

    public ArrayList<Reunion> getReuniones() {
        return reuniones;
    }

    public void setReuniones(ArrayList<Reunion> reuniones) {
        this.reuniones = reuniones;
    }

    public Persona getUsuario() {
        return usuario;
    }

    public void setUsuario(Persona usuario) {
        this.usuario = usuario;
    }

    public void eliminarReunion( Reunion r){
        this.reuniones.remove(r);
    }

    public void agregarReunion(Reunion r){
        this.reuniones.add(r);
    }

    public boolean buscarReunion(Reunion r){
        boolean existe = true;
        for (Reunion reu: this.reuniones) {
            if (reu.equals(r)) {
                existe=true;
            }
        }
        return existe;
    }

    public void seSuperpone(Reunion rNueva){
        for (Reunion r: reuniones) {

        }
    }
}
