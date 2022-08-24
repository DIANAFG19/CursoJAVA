import java.util.Scanner;

public class LoginOperadoresLogicos {
    public static void main(String[] args) {
        String user = "Diana";
        String pswd = "Diana1234";

        String user2 = "Jesus";
        String pswd2 = "Jesus1234";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario: ");
        String usuario = scanner.next();

        System.out.println("Ingrese la contraseña: ");
        String contrasena = scanner.next();

        boolean esAutenticado = false;

        if (user.equals(usuario) && pswd.equals(contrasena) || user2.equals(usuario) && pswd2.equals(contrasena)) {
            esAutenticado = true;
        }

        if (esAutenticado) {
            System.out.println("¡¡BIENVENIDO USUARIO ".concat(usuario.toUpperCase()).concat("!!"));
        }
        else {
            System.out.println("¡¡USUARIO Y/O CONTRASEÑA INCORRECTA!!");
        }

    }
}
