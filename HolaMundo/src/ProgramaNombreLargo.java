import javax.swing.*;

public class ProgramaNombreLargo {
    public static void main(String[] args) {
        String nombreCompleto1 = JOptionPane.showInputDialog("Ingrese el primero nombre con apellido: ");
        String nombreCompleto2 = JOptionPane.showInputDialog("Ingrese el segundo nombre con apellido: ");
        String nombreCompleto3 = JOptionPane.showInputDialog("Ingrese el tercer nombre con apellido: ");

        String[] nombre1 = nombreCompleto1.split(" ");
        String[] nombre2 = nombreCompleto2.split(" ");
        String[] nombre3 = nombreCompleto3.split(" ");

        String mensaje = "";

        if (nombre1[0].length() > nombre2[0].length()) {
            if (nombre1[0].length() > nombre3[0].length()) {
                mensaje = nombreCompleto1;
            } else {
                mensaje = nombreCompleto3;
            }
        } else {
            if (nombre2[0].length() > nombre3[0].length()) {
                mensaje = nombreCompleto2;
            } else {
                mensaje = nombreCompleto3;
            }
        }

        JOptionPane.showMessageDialog(null, mensaje + " tiene el nombre mas largo.");
    }
}
