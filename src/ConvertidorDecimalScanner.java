import java.util.InputMismatchException;
import java.util.Scanner;

public class ConvertidorDecimalScanner {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int numeroDecimal = 0;

        while (true){
            try {
                System.out.println("Ingresa un numero");
                numeroDecimal = sc.nextInt();
                break;
            }catch (InputMismatchException e){
                System.out.println("No se ingreso un numero entero");
                sc.nextLine();
            }
        }
        System.out.println(Integer.toHexString(numeroDecimal));
        System.out.println(Integer.toOctalString(numeroDecimal));
        System.out.println(Integer.toBinaryString(numeroDecimal));
    }
}