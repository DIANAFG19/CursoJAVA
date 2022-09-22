import javax.swing.*;

public class SentenciaForArrays {
    public static void main(String[] args) {
        String[] nombres = {"Diana", "Jesús", "José", "Paco", "María", "Ana", "Juan", "Charly"};
        int count = nombres.length;

        for (int i = 0; i < count; i++) {
            System.out.println(i + " -> " + nombres[i]);
        }

        // Evitar mostrar ciertos nombres.
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase("paco") || nombres[i].equalsIgnoreCase("ana")){
                continue;
            }
            System.out.println(i + " -> " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre, ejemplo \"Pepe\" o  \"María\": ");
        System.out.println("buscar = " + buscar);
        boolean encontrado = false;
        for (int i = 0; i < count; i++) {
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado.");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " NO existe en el sistema.");
        }

    }
}
