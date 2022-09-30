import java.util.Scanner;

public class ProgramaDetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Escribe el nombre de la factura o descripción: ");
        String nombreFactura = scanner.nextLine();

        System.out.println("Escribe el precio 1: ");
        double precioUno = scanner.nextDouble();

        System.out.println("Escribe el precio 2: ");
        double precioDos = scanner.nextDouble();

        double totalBruto = precioUno + precioDos;
        double impuesto = totalBruto * 0.19;
        double totalConImpuesto = totalBruto + impuesto;

        System.out.println("La factura " + nombreFactura + " tiene un total bruto de " + totalBruto + ", con un impuesto de "
                + impuesto + " y el monto después de impuesto es de " + totalConImpuesto);
    }
}
