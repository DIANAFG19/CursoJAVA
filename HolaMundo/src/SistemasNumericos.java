import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroStr = JOptionPane.showInputDialog("Ingrese un número entero: ");
        int numeroDecimal = 0;
        try {
            numeroDecimal= Integer.parseInt(numeroStr);
        } catch (NumberFormatException excp) {
            JOptionPane.showMessageDialog(null, "Debe ingresar un número entero. \nError:" + excp);
            main(args);
            //return;
            System.exit(0);
        }

        String mensajeBinario = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        String mensajeOctal = "Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        String mensajeHexadecimal = "Número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        System.out.println("Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));
        System.out.println("Número octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        System.out.println("Número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        String mensaje = mensajeBinario;
        mensaje += "\n" + mensajeOctal;
        mensaje +=  "\n" + mensajeHexadecimal;
        JOptionPane.showMessageDialog(null, mensaje);
        
    }
}
