import java.util.Scanner;

public class PruebaCuentaBancaria {
    public static void main(String[] args) throws Exception {
        Scanner lea = new Scanner(System.in);

        System.out.println("Digite el numero de la cuenta");
        String numCuenta = lea.nextLine();

        System.out.println("Digite el valor del saldo");
        double saldo = lea.nextDouble();


        CuentaBancaria miCuenta = new CuentaBancaria(numCuenta, saldo);

        //Operacion de deposito
        System.out.println("Digite el valor del deposito");
        double deposito = lea.nextDouble();
        miCuenta.depositar(deposito);

        System.out.println("Digite el valor del retiro");
        double retiro =lea.nextDouble();
        miCuenta.retirar(retiro);

        System.out.println("Su nuevo saldo es: "+miCuenta.getSaldo());
        lea.close();

        
    }
}
