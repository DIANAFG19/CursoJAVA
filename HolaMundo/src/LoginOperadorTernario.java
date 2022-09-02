import java.util.Scanner;

public class LoginOperadorTernario {
    public static void main(String[] args) {

        String[] usernames = {"Diana", "Jesus", "Pepito"};
        String[] passwords = {"Diana1234", "Jesus1234", "Pepito1234"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario: ");
        String usuario = scanner.next();

        System.out.println("Ingrese la contraseña: ");
        String contrasena = scanner.next();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++){
            esAutenticado = (usernames[i].equals(usuario) && passwords[i].equals(contrasena)) ? true : esAutenticado;
            /*if (usernames[i].equals(usuario) && passwords[i].equals(contrasena)) {
                esAutenticado = true;
                break;
            }*/
        }
        String mensaje = esAutenticado ? "¡¡BIENVENIDO USUARIO ".concat(usuario.toUpperCase()).concat("!!") :
                "¡¡USUARIO Y/O CONTRASEÑA INCORRECTA!!";
        System.out.println(mensaje);
        /*if (esAutenticado) {
            System.out.println("¡¡BIENVENIDO USUARIO ".concat(usuario.toUpperCase()).concat("!!"));
        }
        else {
            System.out.println("¡¡USUARIO Y/O CONTRASEÑA INCORRECTA!!");
        }*/


    }
}
