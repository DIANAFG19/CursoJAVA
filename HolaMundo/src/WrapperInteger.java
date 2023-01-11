public class WrapperInteger {
    public static void main(String[] args) {

        int intPrimitivo = 32768;
        Integer intObjeto = Integer.valueOf(intPrimitivo);
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto = " + intObjeto);
        System.out.println("intObjeto2 = " + intObjeto2);

        int num = intObjeto;
        int num2 = intObjeto.intValue();
        System.out.println("num = " + num);
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

        Short shortObject = intObjeto.shortValue();
        System.out.println("shortObjeto = " + shortObject);
        
        Byte byteObject = intObjeto.byteValue();
        System.out.println("byteObject = " + byteObject);

        Long lonValue = intObjeto.longValue();
        System.out.println("lonValue = " + lonValue);
    }
}
