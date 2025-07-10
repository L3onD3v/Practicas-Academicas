import java.util.Scanner;

public class PruebaNumeroDias {
    public static void main(String[] args) throws Exception {

        //Definicion objeto unBisiesto de la clase bisiesto

        Scanner lea = new Scanner(System.in);
        NumeroDias numeroDias = new NumeroDias();

        int aa = 0;
        int mm = 0;

        System.out.println("Digite el año ");
        aa = lea.nextInt();
        System.out.println("Digite el numero del mes ");
        mm = lea.nextInt();
        lea.close();

        numeroDias.setAa(aa);
        numeroDias.setMm(mm);

        System.out.println("El mes "+ numeroDias.getMm()+" del año "+ numeroDias.getAa()+ " es de "+ numeroDias.obtenerNumeroDias()+ " días");
        System.exit(0);
    }
}
