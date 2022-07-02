public class ConversionDeTipos {
    public static void main(String[] args) {

        //Convertir String a int
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        //Convertir String a byte
        byte numeroByte = Byte.parseByte(numeroStr);
        System.out.println("numeroByte = " + numeroByte);

        //Convertir String a double
        String realStr = "9847.545e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        //Convertir String a boolean
        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);


    }
}
