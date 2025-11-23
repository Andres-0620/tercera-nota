import java.util.Scanner;

public class GestionConductores {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese cantidad de conductores: ");
        int cant = sc.nextInt();
        sc.nextLine();

        String[] nombre = new String[cant];
        int[][] kms = new int[cant][7];
        int[] total_kms = new int[cant];

        for (int i = 0; i < cant; i++) {
            System.out.print("\nNombre del conductor " + (i+1) + ": ");
            nombre[i] = sc.nextLine();

            int suma = 0;

            for (int d = 0; d < 7; d++) {
                System.out.print("Kms del día " + (d+1) + ": ");
                kms[i][d] = sc.nextInt();
                suma += kms[i][d];
            }
            sc.nextLine();

            total_kms[i] = suma;
        }

        System.out.println("\n--- Total kilómetros por conductor ---");
        for (int i = 0; i < cant; i++) {
            System.out.println(nombre[i] + " → " + total_kms[i] + " km");
        }
    }
}
