import java.util.Scanner;

public class NumeroNegativo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] vec = new int[10];
        int contador = 0;

        while (contador < 10) {
            System.out.print("Ingrese número (negativo para parar): ");
            int n = sc.nextInt();

            if (n < 0) break;

            vec[contador] = n;
            contador++;
        }

        System.out.println("\nElementos ingresados:");
        for (int i = 0; i < contador; i++) {
            System.out.println(vec[i]);
        }
    }
}

