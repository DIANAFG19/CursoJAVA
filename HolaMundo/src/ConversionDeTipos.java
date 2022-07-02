public class ConversionDeTipos {
    public static void main(String[] args) {

        //Convertir String a int
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        //Convertir int a String
        int numeroInt2 = 30;
        String numeroStr2 = Integer.toString(numeroInt2);
        System.out.println("numeroStr2 = " + numeroStr2);

        //Convertir String a double
        String realStr = "9847.545e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        //Convertir double a String
        double realDouble2 = 9847.545e-3;
        String realStr2 = Double.toString(realDouble2);
        System.out.println("realStr2 = " + realStr2);

        //Convertir String a boolean
        String logicoStr = "true";
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);

        //Convertir boolean a String
        boolean logicoBoolean2 = true;
        String logicoStr2 = Boolean.toString(logicoBoolean2);
        System.out.println("logicoStr2 = " + logicoStr2);

    }
}
