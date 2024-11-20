public class StringsInmutablesTestRendimiento {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long start = System.currentTimeMillis();

        for (int i = 0; i < 5000; i++) {
            //c = c.concat(a).concat(b).concat("\n"); // 5000 -> 26ms
            //c += a + b + "\n"; // 5000 -> 10ms
            sb.append(a).append(b).append("\n");
        }

        System.out.println(sb);
        
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }
}
