import java.util.Arrays;

public class MoverCeros {
    
    public static Object[] moverCeros(Object[] array) {
        Object[] resultado = new Object[array.length];
        
        int indice = 0;
        int contadorCeros = 0;
        
        for (Object elemento : array) {
            if (!esNumerosCero(elemento)) {
                resultado[indice] = elemento;
                indice++;
            } else if (esNumerosCero(elemento)) {
                contadorCeros++;
            }
        }
        
        while (contadorCeros > 0) {
            resultado[indice] = 0;
            indice++;
            contadorCeros--;
        }
        
        return resultado;
    }
    
    private static boolean esNumerosCero(Object elemento) {
        return elemento instanceof Integer && (Integer) elemento == 0 ||
               elemento instanceof Double && (Double) elemento == 0.0 ||
               elemento instanceof Float && (Float) elemento == 0.0f ||
               elemento instanceof Long && (Long) elemento == 0L;
    }
    
    public static void main(String[] args) {
        Object[] ejemplo1 = {false, 1, 0, 1, 2, 0, 1, 3, "a"};
        System.out.println(Arrays.toString(moverCeros(ejemplo1)));
        
        Object[] ejemplo2 = {0, 0, 1, 2, 3};
        System.out.println(Arrays.toString(moverCeros(ejemplo2)));
        
        Object[] ejemplo3 = {1, 2, 3};
        System.out.println(Arrays.toString(moverCeros(ejemplo3)));
        
        Object[] ejemplo4 = {0, 0, 0};
        System.out.println(Arrays.toString(moverCeros(ejemplo4)));
        
        Object[] ejemplo5 = {false, true, 0, "hello", 0, 5, false, 0};
        System.out.println(Arrays.toString(moverCeros(ejemplo5)));
    }
}