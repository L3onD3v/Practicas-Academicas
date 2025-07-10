import java.util.Scanner;

public class PruebaContarVocal {
    public static void main(String[] args) throws Exception {
        ContarVocal cuentavocal = new ContarVocal();
        String cadena = "";
        int cantidad = 0;
        Scanner lea = new Scanner(System.in);
        lea.close();
        System.out.println("Digite la cadena de texto");
        cadena = lea.nextLine();
        
        cuentavocal.setCadena(cadena);
        cantidad = cuentavocal.obtenerCantidadVocal();
        System.out.println("El número de letras 'e' dentro del texto son: "+cantidad+
        " en la cadena "+cuentavocal.getCadena());

        
    }
}
