import java.util.Scanner;

public class PruebaNumeroNatural {
    public static void main(String[] args) throws Exception {
        int valor;
        
        Scanner lea = new Scanner(System.in);
        System.out.println("Digite un número");
        
        valor = lea.nextInt();
        lea.close();
        NumeroNatural num = new NumeroNatural(valor);
        num.imprimirNumerosNaturales();

        




















        
    }
}
