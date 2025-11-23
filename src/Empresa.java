import java.util.Scanner;

public class Empresa {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double[] precios = new double[5];
        int[][] cantidades = new int[5][4];

        for (int i = 0; i < 5; i++) {
            System.out.print("Precio artículo " + (i+1) + ": ");
            precios[i] = sc.nextDouble();
        }

        for (int art = 0; art < 5; art++) {
            for (int suc = 0; suc < 4; suc++) {
                System.out.print("Cantidad art " + (art+1) + " en sucursal " + (suc+1) + ": ");
                cantidades[art][suc] = sc.nextInt();
            }
        }

        System.out.println("\nCantidades totales por artículo:");
        for (int art = 0; art < 5; art++) {
            int suma = 0;
            for (int suc = 0; suc < 4; suc++) {
                suma += cantidades[art][suc];
            }
            System.out.println("Artículo " + (art+1) + ": " + suma);
        }

        int totalSucursal2 = 0;
        for (int art = 0; art < 5; art++) {
            totalSucursal2 += cantidades[art][1];
        }
        System.out.println("\nCantidad total en sucursal 2: " + totalSucursal2);

        System.out.println("Cantidad del artículo 3 en sucursal 1: " + cantidades[2][0]);

        double[] recaudacion = new double[4];
        for (int suc = 0; suc < 4; suc++) {
            double suma = 0;
            for (int art = 0; art < 5; art++) {
                suma += precios[art] * cantidades[art][suc];
            }
            recaudacion[suc] = suma;
        }

        System.out.println("\nRecaudación por sucursal:");
        for (int i = 0; i < 4; i++) {
            System.out.println("Sucursal " + (i+1) + ": $" + recaudacion[i]);
        }

        double totalEmpresa = 0;
        for (double r : recaudacion) totalEmpresa += r;

        System.out.println("\nRecaudación total de la empresa: $" + totalEmpresa);

        double mayor = recaudacion[0];
        int num = 1;

        for (int i = 1; i < 4; i++) {
            if (recaudacion[i] > mayor) {
                mayor = recaudacion[i];
                num = i + 1;
            }
        }

        System.out.println("Sucursal con mayor recaudación: " + num);
    }
}
