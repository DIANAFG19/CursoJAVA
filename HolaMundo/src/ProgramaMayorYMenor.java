import java.util.Scanner;

public class ProgramaMayorYMenor {
    public static void main(String[] args) {

        double numero1 = 0.0d;
        double numero2 = 0.0d;
        double resultado = 0.0d;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer número: ");
        numero1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número: ");
        numero2 = scanner.nextDouble();

        resultado = numero1 > numero2 ? numero1 : numero2;
        System.out.println("El número mayor entre " + numero1 + " y " + numero2 + " es " + resultado);

    }
}
