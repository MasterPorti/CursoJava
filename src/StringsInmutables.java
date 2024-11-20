public class StringsInmutables {
    public static void main(String[] args) {
        String curso = "Curso de";
        curso.concat(" Java");
        System.out.println(curso); // No cambia concat no muta al string original

        String cursoDeJava = curso.concat(" Java");
        System.out.println(cursoDeJava);

         String cursodejava = curso.transform(c -> {
            return c + " Java";
        });
        System.out.println(cursodejava);

    }
}
