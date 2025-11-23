import java.util.Scanner;

public class SumaVectores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int[] vector1 = new int[5];
        int[] vector2 = new int[5];
        int[] vector3 = new int[5];
        
        System.out.println("Ingrese los 5 valores para vector1:");
        for (int i = 0; i < vector1.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector1[i] = scanner.nextInt();
        }
        
        System.out.println("\nIngrese los 5 valores para vector2:");
        for (int i = 0; i < vector2.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector2[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < vector1.length; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }
        
        System.out.println("\n--------RESULTADOS--------");
        
        System.out.println("\nVector 1:");
        mostrarVector(vector1);
        
        System.out.println("\nVector 2:");
        mostrarVector(vector2);
        
        System.out.println("\nVector 3 (Vector1 + Vector2):");
        mostrarVector(vector3);
        scanner.close();
    }
    
    public static void mostrarVector(int[] vector) {
        System.out.print("[ ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]);
            if (i < vector.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
}