import java.util.Locale;

public class HolaMundo {
    public static void main(String[] args) {

        //Variable tipo String.
        String saludar = "Mi nombre es Diana Laura";
        System.out.println(saludar);
        //Variable tipo String convertida a mayúsculas.
        System.out.println("saludar.toUpperCase() = " + saludar.toUpperCase());
        //Variable de tipo int.
        int numero = 10;
        System.out.println("numero = " + numero);
        //Variable tipo boolean.
        boolean valor = true;

        if (valor){
            System.out.println("valor es verdadero");
        }
        else {
            System.out.println("valor es falso");
        }

        //Variable de tipo asignada por su valor.
        var numero5 = 35;

    }
}
