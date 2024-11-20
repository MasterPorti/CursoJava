public class StringsCo {
    public static void main(String[] args) {
        String curso = "Curso de Java";
        String curso2 = new String("Curso de Java");
        System.out.println(curso2 == curso);
        System.out.println(curso.equals(curso2));

        String curso3 = "Curso de Java";
        System.out.println(curso == curso3);
    }
}
