import java.lang.reflect.Method;

public class EjemploMetodoGetClass {
    public static void main(String[] args) {
        
        String texto = "Hola qué tal!";
        Class strClass = texto.getClass(); //Reflexión
        
        System.out.println("strClass.getName() = " + strClass.getName());
        System.out.println("strClass.getSimpleName() = " + strClass.getSimpleName());
        System.out.println("strClass.getPackage() = " + strClass.getPackage());
        System.out.println("strClass.getPackageName() = " + strClass.getPackageName());
        System.out.println("strClass = " + strClass);
        
        for(Method metodo : strClass.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }

        Integer num = 34;
        Class integerClass = num.getClass();
        System.out.println("integerClass.getName() = " + integerClass.getName());
        System.out.println("integerClass.getSimpleName() = " + integerClass.getSuperclass());
        System.out.println("integerClass.getPackage() = " + integerClass.getPackage());
        System.out.println("integerClass.getPackageName() = " + integerClass.getPackageName());
        System.out.println("integerClass = " + integerClass);

        for(Method metodo : integerClass.getMethods()) {
            System.out.println("metodo.getName() = " + metodo.getName());
        }
        
    }
}
