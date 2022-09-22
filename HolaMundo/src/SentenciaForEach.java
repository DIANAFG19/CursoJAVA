public class SentenciaForEach {
    public static void main(String[] args) {
        
        int[] numeros = {1, 3, 5, 7, 9, 11, 13, 14};
        for (int numero : numeros) {
            System.out.println("numero = " + numero);
        }

        String[] nombres = {"Diana", "Jesús", "José", "Paco", "María", "Ana", "Juan", "Charly"};
        for (String nombre : nombres) {
            System.out.println("nombre = " + nombre);
        }
        
    }
}
