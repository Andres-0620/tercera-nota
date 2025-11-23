import java.util.Scanner;

public class Quinela {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[][] equipos = new String[15][2];
        int[][] resultados = new int[15][2];

        for (int i = 0; i < 15; i++) {
            System.out.print("\nEquipo local del partido " + (i+1) + ": ");
            equipos[i][0] = sc.nextLine();

            System.out.print("Equipo visitante del partido " + (i+1) + ": ");
            equipos[i][1] = sc.nextLine();
        }
        for (int i = 0; i < 15; i++) {
            System.out.println("\nGoles del partido " + (i+1));

            System.out.print(equipos[i][0] + ": ");
            resultados[i][0] = sc.nextInt();

            System.out.print(equipos[i][1] + ": ");
            resultados[i][1] = sc.nextInt();
        }

        System.out.println("\n--- RESULTADOS DE LA QUINIELA ---");
        for (int i = 0; i < 15; i++) {
            System.out.println((i+1) + ". " +
                equipos[i][0] + " " + resultados[i][0] + " - " +
                resultados[i][1] + " " + equipos[i][1]);
        }
    }
}
