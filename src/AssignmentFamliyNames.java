import java.util.Scanner;

public class AssignmentFamliyNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfNames = 3;
        String[] names = {"Primer","Segundo","Tercero"};
        StringBuilder formatedInputs = new StringBuilder(0);
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingresa el "+ names[i] + " nombre");
            String name = sc.nextLine();
            String secondCharacterUpper = String.valueOf(name.charAt(1)).toUpperCase() + "." + name.substring(name.length()-2);

            if(i==0){
                formatedInputs = new StringBuilder(secondCharacterUpper);
            }else {
                formatedInputs.append("_").append(secondCharacterUpper);
            }
        }
        System.out.println(formatedInputs);
    }
}
