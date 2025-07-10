import java.util.Scanner;

public class PruebaNumeroNatural {
    public static void main(String[] args) throws Exception {
        Scanner lea = new Scanner(System.in);
        int numero = 0;
        System.out.println("Digite la cantidad de numeros naturales a imprimir");
        numero = lea.nextInt();
        lea.close();
        NumeroNatural unNumero = new NumeroNatural(numero);
        unNumero.ImprimirNumerosNaturales();
       


    }
}
