package services;

import domain.Materia;
import domain.Estudiante;

public class GestionHorarios {

    
    public void inscribirEstudiante(Estudiante est, Materia mat, String horario) {
        est.inscribir(mat.getNombre(), horario);
        System.out.println("Inscripción realizada correctamente.");
    }
}
