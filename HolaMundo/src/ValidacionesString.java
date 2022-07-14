import java.util.Locale;

public class ValidacionesString {
    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo); //true
        if(esNulo) {
            curso = " "; //"Programación en Java" //""
        }
        boolean esVacio = curso.length() == 0;
        System.out.println("esVacio = " + esVacio); //true

        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2); //true

        boolean esBlanco = curso.isBlank();
        System.out.println("esBlanco = " + esBlanco); //true

        if (!esBlanco) {
            System.out.println(curso.toUpperCase());
            System.out.println(curso.concat(" desde cero!"));
        }

    }
}
