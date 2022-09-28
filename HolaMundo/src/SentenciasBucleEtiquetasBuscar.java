public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {

        String frase = "tres tristes tigres tragan trigo en un trigal.";
        char letra = 'g';
        int maxFrase = frase.length();
        int cantidad = 0;
        for (int i = 0; i < maxFrase; i++) {
            if (frase.charAt(i) != letra) {
                continue;
            }
            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad + " veces el carácter '" + letra + "' en la frase.");

        String palabra = "trigo";
        int maxPalabra = palabra.length();
        cantidad = 0;
        buscar:
        for (int i = 0; i < maxFrase; i++) {
            int k = i;
            for (int j = 0; j < maxPalabra; j++) {
                if (frase.charAt(k++) != palabra.charAt(j)) {
                    continue buscar;
                }
            }
            cantidad++;
        }
        System.out.println("Encontrado = " + cantidad + " veces la palabra '" + palabra + "' en la frase.");
    }
}
