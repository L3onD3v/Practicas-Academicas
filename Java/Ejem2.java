import java.util.Scanner;

public class Ejem2 {

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Cuanto vale cada articulo");
        double valorUnitario = input.nextDouble();
        System.out.println("Cuantos articulos se vendieron en el mes");
        int cantVendida = input.nextInt();
        input.close();

        Vendedor v = new Vendedor(valorUnitario, cantVendida);

        System.out.println(v.obtenerSueldo());
    }
    
}
