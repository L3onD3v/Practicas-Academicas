import java.util.Scanner;

public class Multiplicador {

public static void multiplicando(){
    int tabla, limite;

    Scanner lea = new Scanner(System.in);

    System.out.println("Digite la tabla de multiplicar");
    tabla = lea.nextInt();

    System.out.println("Diga hasta donde quiere que llegue la tabla");
    limite = lea.nextInt();
    lea.close();

    for(int i=1;i<=limite;i++){
        System.out.println(tabla +" X "+ i +" = "+(i*tabla));
    }

    }
    public static void main(String[] args){
        multiplicando();
    }
}
