package domain;

import java.util.ArrayList;

public class Materia {

    private String nombre;
    private ArrayList<Horario> horarios;

    public Materia(String nombre) {
        this.nombre = nombre;
        this.horarios = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void agregarHorario(Horario h) {
        horarios.add(h);
    }

    public ArrayList<Horario> getHorarios() {
        return horarios;
    }

    public void mostrarHorarios() {
        System.out.println("Horarios de " + nombre + ":");
        for (Horario horario : horarios) {
            horario.mostrar();
        }
    }
}
