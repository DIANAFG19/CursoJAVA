public class SentenciaSwitchCase {
    public static void main(String[] args) {
        int numero = 1;

        switch(numero){
            case 0:
                System.out.println("El número es 0.");
                break;
            case 1:
                System.out.println("El número es 1.");
                break;
            case 2:
                System.out.println("El número es 2.");
                break;
            case 3:
                System.out.println("El número es 3.");
                break;
            default:
                System.out.println("No tengo ese número.");
        }
    }
}
