public class EjemploString {
    public static void main(String[] args) {

        //Creación de objeto.
        String curso = "Programación Java";
        String curso2 = new String("Programación Java");

        boolean esIgual = curso == curso2;
        System.out.println("esIgual = " + esIgual);

        boolean esIgual2 = curso.equals(curso2);
        System.out.println("esIgual2 = " + esIgual2);

        //Concatenación.
        String profesor = "Diana Laura Flores Garcia";
        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;
        System.out.println(detalle + numeroA + numeroB);
        System.out.println(detalle + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + detalle);

        String detalle2 = curso.concat(" con " + profesor);
        String detalle3 = curso.concat(" con ".concat(profesor));
        System.out.println("detalle2 = " + detalle2);
        System.out.println("detalle3 = " + detalle3);

    }
}
