import java.util.Scanner;

public class VectorRellenado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vector = new int[10];
        int contador = 0;
        int numero;
        
        System.out.println("Ingrese números enteros (introduzca un número negativo para detener):");
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            numero = scanner.nextInt();

            if (numero < 0) {
                System.out.println("\nNúmero negativo introducido. Se detiene la entrada de datos.");
                break;
            }

            vector[i] = numero;
            contador++;
        }

        System.out.println("\n========== VECTOR RELLENADO ==========");
        if (contador == 0) {
            System.out.println("No se ingresaron números.");
        } else {
            System.out.println("Elementos introducidos: " + contador);
            System.out.println("\nVector:");
            for (int i = 0; i < contador; i++) {
                System.out.println("Posición " + i + ": " + vector[i]);
            }
        }
        System.out.println("=====================================");
        
        scanner.close();
    }
}