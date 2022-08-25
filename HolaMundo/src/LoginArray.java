import java.util.Scanner;

public class LoginArray {
    public static void main(String[] args) {

        /*String[] usernames = new String[3];
        String[] passwords = new String[3];

        usernames[0] = "Diana";
        passwords[0] = "Diana1234";
        usernames[1] = "Jesus";
        passwords[1] = "Jesus1234";
        usernames[2] = "Pepito";
        passwords[2] = "Pepito1234";*/

        String[] usernames = {"Diana", "Jesus", "Pepito"};
        String[] passwords = {"Diana1234", "Jesus1234", "Pepito1234"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario: ");
        String usuario = scanner.next();

        System.out.println("Ingrese la contraseña: ");
        String contrasena = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++){
            if (usernames[i].equals(usuario) && passwords[i].equals(contrasena)) {
                esAutenticado = true;
                break;
            }
        }
        if (esAutenticado) {
            System.out.println("¡¡BIENVENIDO USUARIO ".concat(usuario.toUpperCase()).concat("!!"));
        }
        else {
            System.out.println("¡¡USUARIO Y/O CONTRASEÑA INCORRECTA!!");
        }


    }
}
