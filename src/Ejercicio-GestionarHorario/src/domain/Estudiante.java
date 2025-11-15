package domain;

import java.util.ArrayList;

public class Estudiante {

    private String nombre;
    private ArrayList<String> materiasInscritas;

    public Estudiante(String nombre) {
        this.nombre = nombre;
        this.materiasInscritas = new ArrayList<>();
    }

    public void inscribir(String materia, String horario) {
        materiasInscritas.add(materia + " - " + horario);
    }

    public void mostrarInscripciones() {
        System.out.println("Materias inscritas por " + nombre + ":");
        for (String materias : materiasInscritas) {
            System.out.println("- " + materias);
        }
    }
}
