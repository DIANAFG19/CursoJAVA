public class WrapperBoolean {
    public static void main(String[] args) {

        Integer num1, num2;
        num1 = 1;
        num2 = 2;

        boolean primBoolean = num1 > num2; //False
        Boolean objetoBoolean = Boolean.valueOf(primBoolean);
        Boolean objetoBoolean2 = Boolean.valueOf("false");
        Boolean objetoBoolean3 = true;

        System.out.println("primBoolean = " + primBoolean);
        System.out.println("objetoBoolean = " + objetoBoolean);
        System.out.println("objetoBoolean2 = " + objetoBoolean2);

        System.out.println("Comparando objBoolean vs objBoolean2: " + (objetoBoolean == objetoBoolean2));
        System.out.println("Comparando objBoolean2 vs objBoolean3: " + (objetoBoolean2 == objetoBoolean3));
        System.out.println("Comparando objBoolean vs objBoolean3: " + (objetoBoolean == objetoBoolean3));

        System.out.println("Comparando objBoolean vs objBoolean2 con equals: " + (objetoBoolean.equals(objetoBoolean2)));
        System.out.println("Comparando objBoolean2 vs objBoolean3 con equals: " + (objetoBoolean2.equals(objetoBoolean3)));
        System.out.println("Comparando objBoolean vs objBoolean3 con equals: " + (objetoBoolean.equals(objetoBoolean3)));

        boolean primBoolean2 = objetoBoolean2.booleanValue();
        System.out.println("primBoolean2 = " + primBoolean2);

    }
}
