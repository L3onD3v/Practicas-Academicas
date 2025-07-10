import java.util.Scanner;

public class PruebaContarVocal {
    public static void main(String[] args) throws Exception {
        String cadena = "";
        Scanner lea = new Scanner (System.in);
        System.out.println("Digite una cadena de texto");
        cadena = lea.nextLine();
        lea.close();
        ContarVocal contar = new ContarVocal(cadena);
        int numero= contar.obtenerCantidadVocal();
        System.out.println("La cantidad de letra 'e' dentro del texto "+
        contar.getCadena()+" es "+numero);
        
    }
}
