import java.util.Scanner;

public class PruebaDiasMes {
    public static void main(String[] args) throws Exception {
        //Definición objeto dias de la clase NumeroDiasMes
        Scanner lea = new Scanner(System.in);
        NumeroDiasMes numeroDias = new NumeroDiasMes();
        int aa = 0;
        int mm = 0;
        System.out.println("Digite el año");
        aa = lea.nextInt();
        System.out.println("Digite el mes");
        mm = lea.nextInt();
        lea.close();
        numeroDias.setAa(aa);
        numeroDias.setMm(mm);
        System.out.println("El mes "+ numeroDias.getMm()+ " , del año "+numeroDias.getAa()+ " es de "+numeroDias.obtenerNumeroDias()+ " dias" );

        System.exit(0);


    }
}
