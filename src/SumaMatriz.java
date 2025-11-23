import java.util.Scanner;

public class SumaMatriz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] matriz = new int[5][5];
        
        System.out.println("Ingrese los valores de la matriz 5x5:\n");
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }
        
        System.out.println("\n--------MATRIZ INGRESADA--------");
        mostrarMatriz(matriz);
        
        System.out.println("\n--------SUMA DE FILAS--------");
        int[] sumaFilas = new int[5];
        
        for (int i = 0; i < 5; i++) {
            sumaFilas[i] = 0;
            for (int j = 0; j < 5; j++) {
                sumaFilas[i] += matriz[i][j];
            }
            System.out.println("Fila " + i + ": " + sumaFilas[i]);
        }
        
        System.out.println("\n--------SUMA DE COLUMNAS--------");
        int[] sumaColumnas = new int[5];
        
        for (int j = 0; j < 5; j++) {
            sumaColumnas[j] = 0;
            for (int i = 0; i < 5; i++) {
                sumaColumnas[j] += matriz[i][j];
            }
            System.out.println("Columna " + j + ": " + sumaColumnas[j]);
        }
        
        System.out.println("\n--------RESUMEN VISUAL--------");
        mostrarResumen(matriz, sumaFilas, sumaColumnas);
        
        scanner.close();
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
    public static void mostrarResumen(int[][] matriz, int[] sumaFilas, int[] sumaColumnas) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.print("| " + sumaFilas[i]);
            System.out.println();
        }
        
        System.out.println("---\t---\t---\t---\t---\t---");
        
        for (int j = 0; j < 5; j++) {
            System.out.print(sumaColumnas[j] + "\t");
        }
        System.out.println();
    }
}