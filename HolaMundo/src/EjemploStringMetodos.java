public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Diana";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Diana\") = " + nombre.equals("Diana"));
        System.out.println("nombre.equals(\"diana\") = " + nombre.equals("diana"));
        System.out.println("nombre.equalsIgnoreCase(\"diana\") = " + nombre.equalsIgnoreCase("diana"));
        System.out.println("nombre.compareTo(\"Diana\") = " + nombre.compareTo("Diana"));
        System.out.println("nombre.compareTo(\"Diana\") = " + nombre.compareTo("diana"));
        System.out.println("nombre.compareToIgnoreCase(\"diana\") = " + nombre.compareToIgnoreCase("diana"));
        System.out.println("nombre.charAt(3) = " + nombre.charAt(3));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));
        System.out.println("nombre.substring(1, 3) = " + nombre.substring(1, 3));
        
        String trabalengua = "trabalenguas";
        System.out.println("trabalengua.replace('a', 'i') = " + trabalengua.replace('a', 'i'));
        System.out.println("trabalengua.indexOf(\"as\") = " + trabalengua.indexOf("as"));
        System.out.println("trabalengua.lastIndexOf('g') = " + trabalengua.lastIndexOf('g'));
        System.out.println("trabalengua.contains(\"z\") = " + trabalengua.contains("z"));
        System.out.println("trabalengua.startsWith(\"tra\") = " + trabalengua.startsWith("tra"));
        System.out.println("trabalengua.endsWith(\"tra\") = " + trabalengua.endsWith("tra"));
        System.out.println("       trabalenguas      ");
        System.out.println("       trabalenguas      ".trim());

    }
}
