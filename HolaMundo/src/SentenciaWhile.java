public class SentenciaWhile {
    public static void main(String[] args) {

        int i = 0;
        while (i <= 5){
            System.out.println("i = " + i);
            i++;
        }

        i = 0;
        boolean prueba = true;
        while (prueba){
            if (i == 7) {
                prueba = false;
            }
            System.out.println("i = " + i);
            //System.out.println("prueba = " + prueba);
            i++;
        }

        prueba = false;
        do {
            System.out.println("Se ejecuta al menos una vez.");
        } while (prueba);

        i = 0;
        prueba = true;
        do {
            if (i == 10) {
                prueba = false;
            }
            System.out.println("i = " + i);
            //System.out.println("prueba = " + prueba);
            i++;
        } while (prueba);


    }
}
