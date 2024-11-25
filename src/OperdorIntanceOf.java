public class OperdorIntanceOf {
    public static void main(String[] args) {
        String text = "lorem inpumsn";
        Integer num = 6;

        boolean b1 = text instanceof String;
        System.out.println(b1);

        Object text2 = "Hola";

        System.out.println("text2 instanceof String " + text2 instanceof String);
        System.out.println("text2 instanceof Object " + text2 instanceof Object);
    }
}
