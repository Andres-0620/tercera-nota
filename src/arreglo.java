import java.util.Scanner;

public class arreglo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10]; 
        int suma = 0;

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();  
            suma += numeros[i];
        }


        double promedio = (double) suma / numeros.length;


        System.out.println("\nLa suma es: " + suma);
        System.out.println("El promedio es: " + promedio);

        sc.close();
    }
}
