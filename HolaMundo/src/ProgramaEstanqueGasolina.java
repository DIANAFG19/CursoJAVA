import java.util.Scanner;

public class ProgramaEstanqueGasolina {
    public static void main(String[] args) {

        double medida_actual = 0.0d;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la medida actual en litros del tanque: ");
        medida_actual = scanner.nextDouble();

        if (medida_actual == 70) {
            System.out.println("Estanque lleno.");
        } else if (medida_actual >= 60 && medida_actual < 70) {
            System.out.println("Estanque casi lleno.");
        } else if (medida_actual >= 40 && medida_actual < 60) {
            System.out.println("Estanque 3/4.");
        } else if (medida_actual >= 35 && medida_actual < 40) {
            System.out.println("Medio estanque.");
        } else if (medida_actual >= 20 && medida_actual < 35) {
            System.out.println("Suficiente.");
        } else if (medida_actual >= 1 && medida_actual < 20) {
            System.out.println("Insuficiente.");
        }

    }
}
