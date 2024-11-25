import java.util.Arrays;

public class StringToChar {
    public static void main(String[] args) {
        String trabalenguas = "Trabalenguas";

        System.out.println("Trabalenguas to char");

        char[] trabalengiasArray = trabalenguas.toCharArray();
        System.out.println(Arrays.toString(trabalengiasArray));

        System.out.println(trabalengiasArray[1]);

        String[] splitedTrabalenguas = trabalenguas.split("a");
        System.out.println(Arrays.toString(splitedTrabalenguas));
        System.out.println(splitedTrabalenguas);

        String fileName = "image.ejemplo.pdf";

        String[] splitedFileName = fileName.split("\\.");
        System.out.println(Arrays.toString(splitedFileName));
        String extension = splitedFileName[splitedFileName.length-1];
        System.out.println(extension);
    }
}
