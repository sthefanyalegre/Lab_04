package lab_04;

public class Company {
    public static void main(String[] args) {
        
        double[][] ventas = new double[4][5];

        int[][] notasDeVenta = {
            {1, 1, 140},
            {2, 3, 300},
            {3, 2, 240},
            
        };

        for (int i = 0; i < notasDeVenta.length; i++) {
            int vendedor = notasDeVenta[i][0] - 1;
            int producto = notasDeVenta[i][1] - 1;
            double valor = notasDeVenta[i][2];
            ventas[vendedor][producto] += valor;
        }

        System.out.println("Ventas por Vendedor y Producto:");
        System.out.println("Vendedor | Producto 1 | Producto 2 | Producto 3 | Producto 4 | Producto 5 | Total Vendedor");
        System.out.println("-".repeat(90));

        double[] totalesVendedor = new double[4];
        double[] totalesProducto = new double[5];

        for (int vendedor = 0; vendedor < ventas.length; vendedor++) {
            double totalVendedor = 0.0;
            System.out.printf("   %5d |", vendedor + 1);
            for (int producto = 0; producto < ventas[vendedor].length; producto++) {
                System.out.printf("  %11.2f |", ventas[vendedor][producto]);
                totalVendedor += ventas[vendedor][producto];
                totalesProducto[producto] += ventas[vendedor][producto];
            }
            totalesVendedor[vendedor] = totalVendedor;
            System.out.printf("  %11.2f%n", totalVendedor);
        }

        System.out.println("-".repeat(90));
        System.out.print("Total Producto |");
        for (int producto = 0; producto < 5; producto++) {
            System.out.printf("  %11.2f |", totalesProducto[producto]);
        }
        System.out.println();

        System.out.println("-".repeat(90));
        System.out.print("Total General  |");
        double totalGeneral = 0.0;
        for (double total : totalesVendedor) {
            System.out.printf("  %11.2f |", total);
            totalGeneral += total;
        }
        System.out.printf("  %11.2f%n", totalGeneral);
    }
}
