    import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner lea = new Scanner (System.in);
        Persona unaPersona = new Persona();
        int edad = 0;
        System.out.println("Digite la edad de la persona");
        edad = lea.nextInt();
        lea.close();
        unaPersona.setEdad(edad);
        System.out.println(unaPersona.evaluarEdad()+" tiene "+ unaPersona.getEdad()+" años.");
        

    }


    }

