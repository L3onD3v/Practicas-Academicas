import java.util.Scanner;

public class DiaSemana {

    public static void buscarDiaPorNumero(){
        String semana[]={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        Scanner lea = new Scanner(System.in);

        System.out.println("Digite un número de dia de la semana");
        int numero = lea.nextInt();

        if(numero >= 1 && numero <= semana.length){
            System.out.println("El día correspondiente al número digitado es "+semana[numero-1]);
        }else{
            System.out.println("El número digitado no esta en el rango");
        }

        lea.close();



        
    }






    public static void main(String[] args) throws Exception {
        buscarDiaPorNumero();
    }
}
