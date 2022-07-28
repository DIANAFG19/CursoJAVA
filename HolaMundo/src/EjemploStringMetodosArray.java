public class EjemploStringMetodosArray {
    public static void main(String[] args) {
        String trabalengua = "trabalenguas";

        System.out.println("trabalengua.toCharArray() = " + trabalengua.toCharArray());
        char[] arreglo = trabalengua.toCharArray();
        int largo = arreglo.length;
        for(int i = 0; i < largo; i++){
            System.out.println("arreglo[i] = " + arreglo[i]);
            //System.out.print(arreglo[i]);
        }

        System.out.println("trabalengua.split() = " + trabalengua.split("a"));
        String[] arreglo2 = trabalengua.split("a");
        int largo2 = arreglo2.length;
        for(int j = 0; j < largo2; j++){
            System.out.println("arreglo2[j] = " + arreglo2[j]);
            //System.out.print(arreglo2[j]);
        }

        String archivo = "algun.nombre.archivo.wfewfefe";

        System.out.println("archivo.split() = " + archivo.split("\\."));
        String[] arreglo3 = archivo.split("\\.");
        int largo3 = arreglo3.length;
        for(int k = 0; k < largo3; k++){
            System.out.println("arreglo3[k] = " + arreglo3[k]);
            //System.out.print(arreglo2[j]);
        }
        System.out.println("extensión = " + arreglo3[largo3 - 1]);
        
    }
}
