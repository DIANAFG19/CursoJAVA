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
        
    }
}
