public class SentenciasBucleEtiquetas {
    public static void main(String[] args) {

        bucle1:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    continue bucle1;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        System.out.println("************************************************");
        bucle2:
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 2) {
                    break bucle2;
                }
                System.out.println("i = " + i + ", j = " + j);
            }
        }

        System.out.println("************************************************");
        bucle3:
        for (int i = 0; i < 5; i++) {
            int j = 0;
            while (j < 5) {
                if (i == 2) {
                    continue bucle3;
                }
                System.out.println("i = " + i + ", j = " + j);
                j++;
            }
        }

        System.out.println("************************************************");
        bucle4:
        for (int i = 1; i <= 7; i++) {
            int j = 1;
            while (j <= 8) {
                if (i == 6 || i == 7) {
                    System.out.println("Día " + i + ": Descanso de fin de semana.");
                    continue bucle4;
                }
                System.out.println("Día " + i + ", trabajando a las  " + j + " hrs.");
                j++;
            }
        }
    }
}
