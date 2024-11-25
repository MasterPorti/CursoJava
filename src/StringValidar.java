public class StringValidar {
    public static void main(String[] args) {
        String archivo = "dshdfjshfd.xmsl";

        int lastCharacter = archivo.length();
        int dotCharacter = archivo.indexOf(".");
        System.out.println(archivo.substring(dotCharacter,lastCharacter));


        char[] archivoChar = archivo.toCharArray();
        System.out.println(archivo.toCharArray());
    }
}
