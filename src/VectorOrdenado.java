public class VectorOrdenado {
    public static void main(String[] args) {
        int[] vector = new int[10];
        
        System.out.println("Inicializando vector con valores aleatorios...\n");
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 100) + 1;
        }
        
        System.out.println("--------VECTOR ORIGINAL--------");
        mostrarVector(vector);
        
        ordenarBurbuja(vector);
        
        System.out.println("\n--------VECTOR ORDENADO--------");
        mostrarVector(vector);
    }
    
    public static void mostrarVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }
    
    public static void ordenarBurbuja(int[] vector) {
        int n = vector.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (vector[j] > vector[j + 1]) {
                    int temp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = temp;
                }
            }
        }
    }
}