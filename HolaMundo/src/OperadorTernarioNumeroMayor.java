import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {
        int max = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese número uno: ");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese número dos: ");
        int num2 = scanner.nextInt();
        System.out.println("Ingrese número tres: ");
        int num3 = scanner.nextInt();
        System.out.println("Ingrese número cuatro: ");
        int num4 = scanner.nextInt();

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        max = (max > num4) ? max : num4;

        System.out.println("El número mayor es: " + max);

    }
}
