import java.util.Scanner;

public class PruebaContarVocal {
    public static void main(String[] args) throws Exception {
        ContarVocal cuentaVocal = new ContarVocal();
        String cadena = "";
        int cantidad = 0;

        Scanner lea = new Scanner(System.in);
        System.out.println("Digite una frase corta");
        cadena = lea.nextLine();
        lea.close();
        cuentaVocal.setCadena(cadena);
        cantidad = cuentaVocal.obtenerCantidadVocal();
        System.out.println("La vocal 'e' está presente "+cantidad +" veces en la cadena "+cuentaVocal.getCadena());
    }
}
