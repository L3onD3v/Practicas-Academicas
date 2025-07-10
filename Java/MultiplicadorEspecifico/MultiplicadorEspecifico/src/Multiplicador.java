import java.util.Scanner;

public class Multiplicador {

public static void multiplicando(){
    Scanner lea = new Scanner (System.in);

    System.out.println("Quieres una tabla especifica o todas");
    String opcion = lea.nextLine();

    if(opcion.equalsIgnoreCase("especifica")){
        System.out.println("Digite la tabla de multiplicar");
        int tabla = lea.nextInt();

        System.out.println("Diga hasta donde quiere que llegue la tabla");
        int limite = lea.nextInt();
        lea.close();

        for(int i=1;i<=limite;i++){
            System.out.println(tabla +" X "+ i +" = "+(i*tabla));
        }
        
    } else if(opcion.equalsIgnoreCase("todas")){
        System.out.println("Diga hasta donde quiere que lleguen las tablas");
        int limite = lea.nextInt();

        for(int tabla = 1; tabla <= 10; tabla++){
            System.out.println("\nTabla del "+tabla+" :");
            for(int i = 1;i<=limite;i++){
                System.out.println(tabla +" X "+ i +" = "+(i*tabla));
            }
        }
    }else{
        System.out.println("Opción no valida");
    }
    lea.close();
    
}




    public static void main(String[] args) throws Exception {
        multiplicando();
    }
}
