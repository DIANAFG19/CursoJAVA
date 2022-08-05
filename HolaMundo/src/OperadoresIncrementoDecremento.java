public class OperadoresIncrementoDecremento {
    public static void main(String[] args) {
        int i = 1;
        int j = ++i; // i = i + 1;
        System.out.println("Pre incremento -> i = " + i);
        System.out.println("Pre incremento -> j = " + j);

        i = 2;
        j = i++;
        System.out.println("Post incremento -> i = " + i);
        System.out.println("Post incremento -> j = " + j);

        i = 2;
        j = --i; // i = i - 2;
        System.out.println("Pre decremento -> i = " + i);
        System.out.println("Pre decremento -> j = " + j);

        i = 1;
        j = i--;
        System.out.println("Post decremento -> i = " + i);
        System.out.println("Post decremento -> j = " + j);
    }
}
