public class OperadoresLogicos {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l = 2.1413e3;
        boolean m = false;

        boolean b = i == j && k > l;
        System.out.println("b = " + b);

        boolean b2 = i == 3 && k < l;
        System.out.println("b2 = " + b2);

        boolean b3 = i == j || k > l;
        System.out.println("b3 = " + b3);

        boolean b4 = i == j || k < l;
        System.out.println("b4 = " + b4);

        boolean b5 = i == j && k > l || m == false;
        System.out.println("b5 = " + b5);

        boolean b6 = i == j && (k > l || m == false);
        System.out.println("b5 = " + b6);

    }
}
