import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double numero1 = sc.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double numero2 = sc.nextDouble();
        System.out.print("Ingrese el tercer número: ");
        double numero3 = sc.nextDouble();

        double media = (numero1 + numero2 + numero3) / 3;
        System.out.println("La media de los tres números es: " + media);

        sc.close();
    }
}