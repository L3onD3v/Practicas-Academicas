import java.util.Scanner;

public class PruebaNumMayor {
    public static void main(String[] args) throws Exception {
        int num = 0;

        Scanner lectura = new Scanner(System.in);
        
        CantSuperior numeroMayor = new CantSuperior();
        System.out.println("Digite un número");
        num = lectura.nextInt();
        numeroMayor.setNumero(num);

        lectura.close();

        System.out.println("El numero "+ num+ numeroMayor.esMayor()+" a 150.000");


    }
}
