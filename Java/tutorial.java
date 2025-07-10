import java.util.Scanner;

public class tutorial{

    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Cual es el valor de cada articulo");
        double valorUnitario = input.nextDouble();
        System.out.println("Cuantos articulos se vendiueron en el mes");
        int cantVendida = input.nextInt();
        input.close();


        System.out.println(obtenerSueldo(valorUnitario,cantVendida));
        

    }


    public static double obtenerSueldo(double valorUnitario, int cantVendida ){
        final double COMISION = 0.16;
        //final double SUELDO_FIJO = 14000;
        return (cantVendida * valorUnitario * COMISION);
    }
}