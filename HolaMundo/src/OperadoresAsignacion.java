public class OperadoresAsignacion {
    public static void main(String[] args) {
        int i = 5;
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        i += 2; //i = i + 2;
        System.out.println("i = " + i);

        i -= 2; //i = i - 2;
        System.out.println("i = " + i);

        j *= 2; //j = j * 2;
        System.out.println("j = " + j);

        j /= 2; //j = j / 2;
        System.out.println("j = " + j);
        
        String sqlString = "SELECT * FROM CLIENTES AS C";
        sqlString += " where c.nombre = 'Andres'";
        sqlString += " and c.activo = 1";
        System.out.println("sqlString = " + sqlString);
        

    }
}
