public class NumerosPrimos {

    public static boolean esPrimo(int numero) {

        if (numero < 2) {
            return false;
        }

        for (int i = 2; i <= numero / 2; i++) {
            if (numero % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int n = 29;
        if (esPrimo(n)) {
            System.out.println(n + " es primo");
        } else {
            System.out.println(n + " NO es primo");
        }

        System.out.println("\nNúmeros primos entre 1 y 100:");

        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}
