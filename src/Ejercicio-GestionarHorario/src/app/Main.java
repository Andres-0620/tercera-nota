package app;

import domain.Materia;
import domain.Horario;
import domain.Estudiante;
import services.GestionHorarios;

public class Main {
    public static void main(String[] args) {

        // Crear materia
        Materia prog = new Materia("Programación");
        prog.agregarHorario(new Horario("Lunes 8-10"));
        prog.agregarHorario(new Horario("Miércoles 10-12"));

        // Crear estudiante
        Estudiante est = new Estudiante("Andrés");

        // Mostrar horarios
        prog.mostrarHorarios();

        // Inscribir
        GestionHorarios gestor = new GestionHorarios();
        gestor.inscribirEstudiante(est, prog, "Lunes 8-10");

        // Mostrar resultado
        est.mostrarInscripciones();
    }
}
