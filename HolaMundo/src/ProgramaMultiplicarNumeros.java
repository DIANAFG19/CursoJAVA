import java.util.Scanner;

public class ProgramaMultiplicarNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();
        int suma = 0;
        if (numero1 < 0 && numero2 < 0) {
            for (int i = 0; i > numero2; i--) {
                suma += (-numero1);
            }
        } else if (numero1 > 0 && numero2 <0) {
            for (int i = 0; i < (-numero2); i++) {
                suma += (-numero1);
            }
        } else {
            for (int i = 0; i < numero2; i++) {
                suma += numero1;
            }
        }
        System.out.println("La multiplicación sin usar el operador (*) es: " + suma);
    }
}
