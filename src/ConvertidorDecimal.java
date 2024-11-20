import javax.swing.*;

public class ConvertidorDecimal {
    public static void main(String[] args) {
        int numeroDecimal = 0;
        try {
            numeroDecimal = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese Un numero entero"));
        }catch (NumberFormatException e){
            JOptionPane.showInternalMessageDialog(null,"No es un numero");
            main(args);
            System.exit(0);
        }
        System.out.println(Integer.toHexString(numeroDecimal));
        String mensaje = "En hexadecimal es : " + Integer.toHexString(numeroDecimal);
        mensaje += "\nEn binario es :" + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nEn Octal es :" + Integer.toOctalString(numeroDecimal);
        JOptionPane.showInternalMessageDialog(null,mensaje);
    }
}