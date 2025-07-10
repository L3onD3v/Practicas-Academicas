import java.util.Scanner;

public class PruebaBisiesto {
    private Bisiesto unBisiesto;

    

    public PruebaBisiesto() {
        this.unBisiesto = new Bisiesto();
    }


    public void imprimirResultado(){
        int aa = 0;
        System.out.println("Digite el año");
        Scanner lea = new Scanner(System.in);
        aa = lea.nextInt();
        lea.close();
        unBisiesto.setAnnio(aa);
        if(unBisiesto.esBisiesto()){
            System.out.println(unBisiesto.getAnnio()+" Es un año bisiesto");
        }else{
            System.out.println(unBisiesto.getAnnio()+" No es un año bisiesto");
        }
    }
    public static void main(String[] args) throws Exception {
        PruebaBisiesto unaPrueba = new PruebaBisiesto();
        unaPrueba.imprimirResultado();
    
    }
}
