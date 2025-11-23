import java.util.Scanner;

public class Meses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        
        String[] nombresMeses = {
            "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
        };
        
        int[] diasMeses = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };
        
        System.out.print("Ingrese el número del mes (1-12): ");
        int numeroMes = scanner.nextInt();
        
        if (numeroMes < 1 || numeroMes > 12) {
            System.out.println("Error: Ingrese un número entre 1 y 12.");
        } else {

            String nombreMes = nombresMeses[numeroMes - 1];
            int diasDelMes = diasMeses[numeroMes - 1];
            
            System.out.println("\n========== INFORMACION DEL MES ==========");
            System.out.println("Mes: " + nombreMes);
            System.out.println("Número: " + numeroMes);
            System.out.println("Días: " + diasDelMes);
        }
        
        scanner.close();
    }
}