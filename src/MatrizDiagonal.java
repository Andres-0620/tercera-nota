public class MatrizDiagonal {
    public static void main(String[] args) {
        
        int[][] diagonal = new int[5][5];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j) {
                    diagonal[i][j] = 1;
                } else {
                    diagonal[i][j] = 0;
                }
            }
        }
        
        System.out.println("--------MATRIZ DIAGONAL 5x5--------\n");
        mostrarMatriz(diagonal);
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}