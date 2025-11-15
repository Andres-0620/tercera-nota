package services;

import domain.Parqueadero;
import domain.Vehiculo;
import domain.Registro;

public class GestionParqueadero {

    public void registrarEntrada(Parqueadero parqueadero, Vehiculo v) {
        if (parqueadero.hayCupo()) {
            parqueadero.agregarRegistro(new Registro(v));
            System.out.println("Vehículo " + v.getPlaca() + " registrado.");
        } else {
            System.out.println("No hay cupo disponible.");
        }
    }
}
