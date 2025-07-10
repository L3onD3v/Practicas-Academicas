import java.util.Scanner;

public class pPruebaCadena {
    public static void main(String[] args) throws Exception {
        // Cadena miCadena = new Cadena("Colombia");
        Cadena miCadena2 = new Cadena();

        Scanner lea = new Scanner(System.in);
        System.out.println("Digite una palabra o frase");
        String palabra = lea.nextLine();

        lea.close();
        miCadena2.setCadena(palabra);
        miCadena2.imprimirPrimerElemento();

        System.out.println("El primer elemento es: " + miCadena2.imprimirPrimerElemento());
        System.out.println("El tercer elemento es: " + miCadena2.imprimirTercerElemento());
        System.out.println("El ultimo elemento es: " + miCadena2.imprimirUltimoElemento());
        System.out.println("El ultimo elemento es: " + miCadena2.imprimirElementosImpares());
    }
}
