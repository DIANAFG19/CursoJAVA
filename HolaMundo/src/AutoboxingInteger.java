public class AutoboxingInteger {
    public static void main(String[] args) {

        Integer enterosExplicito = Integer.valueOf(1); //De forma explicita
        Integer[] enteros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}; //Autoboxing

        int suma = 0;
        int suma2 = 0;

        // DE FORMA EXPLICITA
        for(Integer i : enteros) {
           if(i.intValue() % 2 == 0) {
               suma += i.intValue();
           }
        }
        System.out.println("suma = " + suma);

        // AUTOBOXING
        for(Integer i : enteros) {
            if(i % 2 == 0) {
                suma2 += i;
            }
        }
        System.out.println("suma2 = " + suma2);
    }
}
