import java.util.Scanner;

public class ProgramaNumeroMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa la cantidad de números a calcular: ");
        int cantidad = scanner.nextInt();
        Integer[] numeros = new Integer[cantidad];
        int menor = 0;

        bucle:
        for(int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese un número: ");
            numeros[i] = scanner.nextInt();
            if(i == 0) {
                menor = numeros[i];
                continue bucle;
            }
            if(numeros[i] <= menor) {
                menor = numeros[i];
            }
        }
        System.out.println("El menor número ingresado es: " + menor);

        if(menor < 10) {
            System.out.println("El número menor " + menor + " es menor que 10!.");
        } else {
            System.out.println("El número menor " + menor + " es igual o mayor que 10!.");
        }
    }
}
