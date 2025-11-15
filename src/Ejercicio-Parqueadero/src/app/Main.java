package app;

import domain.Parqueadero;
import domain.Vehiculo;
import services.GestionParqueadero;

public class Main {
    public static void main(String[] args) {

        
        Parqueadero parqueadero = new Parqueadero(2);

        
        GestionParqueadero gestor = new GestionParqueadero();

        
        Vehiculo v1 = new Vehiculo("AAA-123");
        Vehiculo v2 = new Vehiculo("BBB-456");
        Vehiculo v3 = new Vehiculo("CCC-789");

        
        gestor.registrarEntrada(parqueadero, v1);
        gestor.registrarEntrada(parqueadero, v2);
        gestor.registrarEntrada(parqueadero, v3); 
       
        System.out.println();
        parqueadero.mostrarVehiculos();
    }
}
