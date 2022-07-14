public class TestRendimientoString {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        long inicio = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder(a);

        for (int i = 0; i<500; i ++){
            //c = c.concat(a).concat(b).concat("\n"); // 1ms
            //c += a + b + "\n"; // 31ms
            sb.append(a).append(b).append("\n"); // 0ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
    }
}
