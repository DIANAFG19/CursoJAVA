public class EjemploStringExtension {
    public static void main(String[] args) {

        String archivo = "alguna.imagen.doc";
        System.out.println("archivo.substring(archivo.length()-4) = " + archivo.substring(archivo.length()-4));

        int punto = archivo.lastIndexOf(".");
        System.out.println("archivo.substring(punto+1) = " + archivo.substring(punto+1));
        

    }
}
