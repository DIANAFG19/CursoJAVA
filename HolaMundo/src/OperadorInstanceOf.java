public class OperadorInstanceOf {
    public static void main(String[] args) {
        String texto = "Creando un objeto de la Clase String... qué tal!";
        Integer numero = 40;
        Double decimal = 45.9;

        Boolean b1 = texto instanceof String;
        System.out.println("¿Texto es del tipo String? " + b1);

        b1 = texto instanceof Object;
        System.out.println("¿Texto es del tipo Object? " + b1);

        b1 = numero instanceof Integer;
        System.out.println("¿Numero es del tipo Integer? " + b1);

        b1 = numero instanceof Number;
        System.out.println("¿Numero es del tipo Number? " + b1);

        b1 = numero instanceof Object;
        System.out.println("¿Numero es del tipo Object? " + b1);

        b1 = decimal instanceof Number;
        System.out.println("¿Decimal es del tipo Number? " + b1);

        b1 = b1 instanceof Boolean;
        System.out.println("¿B1 es del tipo Boolean? " + b1);
    }
}
