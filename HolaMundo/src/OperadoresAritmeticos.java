import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int i = 5, j = 4;
        
        int suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("suma = " + (i + j));
        
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("resta = " + (i - j));
        
        int multiplicacion = i * j;
        System.out.println("multiplicacion = " + multiplicacion);
        System.out.println("multiplicacion = " + (i * j));
        
        float division = (float)i / j;
        System.out.println("division = " + division);
        System.out.println("division = " + ((float)i / j));

        int resto = i % j;
        System.out.println("resto = " + resto);
        System.out.println("resto = " + (8 % 5));

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número: "));
        if(numero % 2 == 0){
            System.out.println("numero par = " + numero);
        }
        else {
            System.out.println("numero impar= " + numero);
        }
    }
}
