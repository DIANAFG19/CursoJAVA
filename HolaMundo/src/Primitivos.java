public class Primitivos {
    public static void main(String[] args){

        //Declaramos variable tipo byte (1 byte, 8 bits, -128 a 127)
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("Tipo byte corresponde en byte a: " + Byte.BYTES);
        System.out.println("Tipo byte corresponde en bites a: " + Byte.SIZE);
        System.out.println("Valor máximo de byte: " + Byte.MAX_VALUE);
        System.out.println("Valor mínimo de byte: " + Byte.MIN_VALUE);

        //Declaramos variable tipo short (2 bytes, 16 bits, -32768 a 32767)
        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("Tipo short corresponde en byte a: " + Short.BYTES);
        System.out.println("Tipo short corresponde en bites a: " + Short.SIZE);
        System.out.println("Valor máximo de short: " + Short.MAX_VALUE);
        System.out.println("Valor mínimo de short: " + Short.MIN_VALUE);

        //Declaramos variable tipo int (4 bytes, 32 bits, -2147483648 a 2147483647)
        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Tipo int corresponde en byte a: " + Integer.BYTES);
        System.out.println("Tipo int corresponde en bites a: " + Integer.SIZE);
        System.out.println("Valor máximo de int: " + Integer.MAX_VALUE);
        System.out.println("Valor mínimo de int: " + Integer.MIN_VALUE);

        //Declaramos variable tipo long (8 bytes, 64 bits, -9223372036854775808 a 9223372036854775807)
        long numeroLong = 9223372036854775807L;
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("Tipo long corresponde en byte a: " + Long.BYTES);
        System.out.println("Tipo long corresponde en bites a: " + Long.SIZE);
        System.out.println("Valor máximo de long: " + Long.MAX_VALUE);
        System.out.println("Valor mínimo de long: " + Long.MIN_VALUE);
    }
}
