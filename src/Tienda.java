public class Tienda {
    public static void main(String[] args) {
        double camiseta = 25;
        double pantalon = 30;
        double desc = 0.15;
        System.out.println("Precios originales");
        System.out.println("Camiseta: $25");
        System.out.println("Pantalon: $30");
        double camiseta1 = camiseta - (camiseta * desc);
        double pantalon1 = pantalon - (pantalon * desc);
        double camiseta2 = camiseta1 - (camiseta1 * 0.05);
        double total = camiseta1 + pantalon1 + camiseta2;
        System.out.println("Precios con los descuentos");
        System.out.println("Camiseta: $" + String.format("%.2f", camiseta1));
        System.out.println("Pantalón: $" + String.format("%.2f", pantalon1));
        System.out.println("Segunda camiseta (15% + 5%): $" + String.format("%.2f", camiseta2));
        System.out.println("Total: $" + String.format("%.2f", total));
    }
}
