import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Escribe nombre de la persona uno: ");
        String nombrePersona1 = scanner.nextLine();
        System.out.print("Escribe nombre de la persona dos: ");
        String nombrePersona2 = scanner.nextLine();
        System.out.print("Escribe nombre de la persona tres: ");
        String nombrePersona3 = scanner.nextLine();

        String nombre1 = nombrePersona1.substring(1, 2).toUpperCase() + "." + nombrePersona1.substring(nombrePersona1.length() - 2);
        String nombre2 = nombrePersona2.substring(1, 2).toUpperCase() + "." + nombrePersona2.substring(nombrePersona2.length() - 2);
        String nombre3 = nombrePersona3.substring(1, 2).toUpperCase() + "." + nombrePersona3.substring(nombrePersona3.length() - 2);

        String resultado = nombre1 + "_" + nombre2 + "_" + nombre3;

        System.out.println("resultado = " + resultado);

    }
}
