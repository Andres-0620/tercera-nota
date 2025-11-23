public class MatrizMarco {
    public static void main(String[] args) {
        
        int[][] marco = new int[5][15];
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 15; j++) {
                if (i == 0 || i == 4) {
                    marco[i][j] = 1;
                }
                else if (j == 0 || j == 14) {
                    marco[i][j] = 1;
                }
                else {
                    marco[i][j] = 0;
                }
            }
        }
        
        System.out.println("--------MATRIZ MARCO 5x15--------\n");
        mostrarMatriz(marco);
    }
    
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println();
        }
    }
}