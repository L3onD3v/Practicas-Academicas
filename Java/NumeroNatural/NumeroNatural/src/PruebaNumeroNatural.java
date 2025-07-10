import java.util.Scanner;

public class PruebaNumeroNatural {
    public static void main(String[] args) throws Exception {
        int cantidad = 0;
        Scanner lea = new Scanner (System.in);
        System.out.println("Digite un número");
        cantidad = lea.nextInt();
        lea.close();

        NumeroNatural numero = new NumeroNatural(cantidad);
        numero.imprimirNumeros();
        


    }
}
