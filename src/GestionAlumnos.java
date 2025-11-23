import java.util.Scanner;
import java.util.ArrayList;

public class GestionAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();
        
        String nombre;
        int edad;
        
        System.out.println("Ingrese el nombre y edad de cada alumno.");
        System.out.println("ingrese '*' como nombre para terminar\n");
        
        do {
            System.out.print("Nombre: ");
            nombre = scanner.nextLine();
            
            if (nombre.equals("*")) {
                break;
            }
            
            System.out.print("Edad: ");
            edad = scanner.nextInt();
            scanner.nextLine(); 
            
            nombres.add(nombre);
            edades.add(edad);
            System.out.println();
            
        } while (true);
        
        if (nombres.size() == 0) {
            System.out.println("\nNo se ingresaron datos de alumnos.");
        } else {

            System.out.println("\n--------ALUMNOS MAYORES DE EDAD--------");
            boolean hayMayoresDeEdad = false;
            
            for (int i = 0; i < nombres.size(); i++) {
                if (edades.get(i) >= 18) {
                    System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
                    hayMayoresDeEdad = true;
                }
            }
            
            if (!hayMayoresDeEdad) {
                System.out.println("No hay alumnos mayores de edad.");
            }
            
            int edadMaxima = edades.get(0);
            for (int i = 1; i < edades.size(); i++) {
                if (edades.get(i) > edadMaxima) {
                    edadMaxima = edades.get(i);
                }
            }

            System.out.println("\n--------ALUMNOS CON MAYOR EDAD--------");
            System.out.println("Edad máxima: " + edadMaxima + " años\n");
            
            for (int i = 0; i < nombres.size(); i++) {
                if (edades.get(i) == edadMaxima) {
                    System.out.println(nombres.get(i) + " - " + edades.get(i) + " años");
                }
            }
        }
        
        scanner.close();
    }
}