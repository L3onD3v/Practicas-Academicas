import java.util.Scanner;

public class PruebaNumMayor {
    public static void main(String[] args) throws Exception {
        int n1 = 0;
        int n2 = 0;

        Scanner lea = new Scanner(System.in);

        NumMayor numero = new NumMayor();
        

        System.out.println("Digite un número");
        n1 = lea.nextInt();
        numero.setA(n1);

        System.out.println("Digite el segundo número");
        n2 = lea.nextInt();
        numero.setB(n2);

        lea.close();
        
        
        System.out.println("El primer número que digitó es "+numero.esMayor());



    }
}
