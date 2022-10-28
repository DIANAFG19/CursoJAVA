import java.util.Scanner;

public class ProgramaNotasAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double[] notas = new Double[20];
        double notasMayor5 = 0;
        int contadorMayor5 = 0;
        double notasMenor4 = 0;
        int contadorMenor4 = 0;
        int contadorIgual1 = 0;
        double sumaNotas = 0;
        for(int i = 0; i < 20; i++) {
            System.out.println("Ingrese tu nota final en escala del 1 al 7: ");
            notas[i] = scanner.nextDouble();
            if (notas[i] > 5){
                notasMayor5 = notasMayor5 + notas[i];
                contadorMayor5 ++;
            }
            if (notas[i] < 4){
                notasMenor4 = notasMenor4 + notas[i];
                contadorMenor4 ++;
            }
            if (notas[i] == 1){
                contadorIgual1 ++;
            }
            if (notas[i] == 0) {
                System.out.println("¡Error! Finalizando el programa.");
                break;
            }
            sumaNotas = sumaNotas + notas[i];
        }
        System.out.println("El promedio de las notas mayores a 5 es " + notasMayor5 / contadorMayor5);
        System.out.println("El promedio de las notas menores a 4 es " + notasMenor4 / contadorMenor4);
        System.out.println("La cantidad de notas iguales a 1 son " + contadorIgual1);
        System.out.println("El promedio total de las notas es " + sumaNotas / 20);
    }
}
