import java.util.ArrayList;
import java.util.Scanner;

public class Lista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> carros = new ArrayList<>();

        System.out.print("¿Cuántos carros quiere ingresar? ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Digite el nombre del carro " + (i + 1) + ": ");
            String carro = sc.nextLine();
            carros.add(carro); 
        }

        System.out.println("\nLos carros que ingresó son:");
        for (int i = 0; i < carros.size(); i++) {
            System.out.println((i + 1) + ". " + carros.get(i));
        }

        sc.close();
    }
}