package domain;

import java.util.ArrayList;

public class Parqueadero {

    private int capacidad;
    private ArrayList<Registro> registros;

    public Parqueadero(int capacidad) {
        this.capacidad = capacidad;
        this.registros = new ArrayList<>();
    }

    public boolean hayCupo() {
        return registros.size() < capacidad;
    }

    public void agregarRegistro(Registro r) {
        registros.add(r);
    }

    public void mostrarVehiculos() {
        System.out.println("Vehículos en el parqueadero:");
        for (Registro r : registros) {
            System.out.println("- " + r.getVehiculo().getPlaca());
        }
    }
}
