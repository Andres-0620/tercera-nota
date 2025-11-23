import java.util.Scanner;

public class GestionTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[] temperaturaMinima = new double[5];
        double[] temperaturaMaxima = new double[5];
        double[] temperaturaMedia = new double[5];
        
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes"};
        
        System.out.println("Ingrese las temperaturas mínima y máxima para cada día:\n");
        
        for (int i = 0; i < 5; i++) {
            System.out.println(dias[i] + ":");
            System.out.print("  Temperatura mínima: ");
            temperaturaMinima[i] = scanner.nextDouble();
            
            System.out.print("  Temperatura máxima: ");
            temperaturaMaxima[i] = scanner.nextDouble();
            
            temperaturaMedia[i] = (temperaturaMinima[i] + temperaturaMaxima[i]) / 2;
            System.out.println();
        }
        
        System.out.println("--------TEMPERATURA MEDIA DE CADA DÍA--------");
        for (int i = 0; i < 5; i++) {
            System.out.println(dias[i] + ": " + String.format("%.2f", temperaturaMedia[i]) + "°C");
        }
        
        double temperaturaMinimaBaja = temperaturaMinima[0];
        for (int i = 1; i < 5; i++) {
            if (temperaturaMinima[i] < temperaturaMinimaBaja) {
                temperaturaMinimaBaja = temperaturaMinima[i];
            }
        }
        
        System.out.println("\n--------DÍAS CON MENOS TEMPERATURA--------");
        System.out.println("Temperatura mínima más baja: " + temperaturaMinimaBaja + "°C\n");
        for (int i = 0; i < 5; i++) {
            if (temperaturaMinima[i] == temperaturaMinimaBaja) {
                System.out.println(dias[i] + " - Mínima: " + temperaturaMinima[i] + "°C, Máxima: " + temperaturaMaxima[i] + "°C");
            }
        }
        
        System.out.println("\n--------BÚSQUEDA DE TEMPERATURA MÁXIMA--------");
        System.out.print("Ingrese una temperatura para buscar días con esa temperatura máxima: ");
        double temperaturaBuscada = scanner.nextDouble();
        
        boolean encontrado = false;
        System.out.println();
        for (int i = 0; i < 5; i++) {
            if (temperaturaMaxima[i] == temperaturaBuscada) {
                System.out.println(dias[i] + " - Mínima: " + temperaturaMinima[i] + "°C, Máxima: " + temperaturaMaxima[i] + "°C");
                encontrado = true;
            }
        }
        
        if (!encontrado) {
            System.out.println("No hay días con temperatura máxima de " + temperaturaBuscada + "°C");
        }
        
        
        scanner.close();
    }
}