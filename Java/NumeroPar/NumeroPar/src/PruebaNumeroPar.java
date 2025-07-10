import java.util.Scanner;

public class PruebaNumeroPar {
    public static void main(String[] args) throws Exception {
        int n = 0;
        Scanner lea = new Scanner(System.in);
        System.out.println("Digite  un numero");
        n = lea.nextInt();
        lea.close();

        NumeroPar numero = new NumeroPar();
        numero.setNumero(n);

        System.out.println("El numero "+numero.getNumero()+ " es "+ numero.evaluarNumero());



        
    }
}
