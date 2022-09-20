public class SentenciaFor {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++){
            System.out.println("Hola, incrementando... " + i);
        }

        int j = 0;
        for (; j <= 5; j++){
            System.out.println("Segunda prueba... " + j);
        }
        System.out.println("j = " + j);

        for (int k = 5; k >= 1; k--){
            System.out.println("Hola, decrementando... " + k);
        }

        for (int i = 1, l = 10; i < l ; i++, l--){
            System.out.println(i + " ----- " + l);
        }

        for (int i = 0; i <= 10; i++){
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Número impares -> " + i);
        }

        for (int i = 0; i <= 10; i++){
            if (i % 2 != 0) {
                continue;
            }
            System.out.println("Número pares -> " + i);
        }


    }
}
