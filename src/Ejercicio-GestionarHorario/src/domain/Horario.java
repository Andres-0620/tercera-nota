package domain;

public class Horario {

    private String descripcion;

    public Horario(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void mostrar() {
        System.out.println("- " + descripcion);
    }
}
