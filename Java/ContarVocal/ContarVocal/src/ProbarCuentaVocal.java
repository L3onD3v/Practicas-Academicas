import java.util.Scanner;

public class ProbarCuentaVocal {
    public static void main(String[] args) throws Exception {
    String frase = "";
    Scanner lea = new Scanner(System.in);
    System.out.println("Digite una frase");
    frase = lea.nextLine();
    lea.close();
    ContarVocal vocal = new ContarVocal();
    vocal.setCadena(frase);
    System.out.println(" la frase tiene "+vocal.ObtenerCantidadVocal());


    }
}
 