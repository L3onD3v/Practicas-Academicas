public class CuentaBancaria{
    private String numeroCuenta;
    private double saldo;


    public CuentaBancaria(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        if(saldo>0){
            this.saldo = saldo;
        }else{
            this.saldo = 1;
            System.out.println("El saldo no tiene un valor valido, fué asignado 1");
        }
        }


    public String getNumeroCuenta() {
        return numeroCuenta;
    }


    public double getSaldo() {
        return saldo;
    }


    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }


    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double nuevoSaldo){
        if(nuevoSaldo>0){
            saldo+=nuevoSaldo;
            System.out.println("Deposito realizado con éxito. Nuevo saldo = "+saldo);
        }else{
            System.out.println("Digite un valor valido para el nuevo deposito");
        }
    }

    public void retirar(double valorRetiro){
        if(saldo>=valorRetiro){
            saldo-=valorRetiro;
            System.out.println("Retiro realizado con éxito. Nuevo saldo = "+saldo);
        }else{
            System.out.println("El valor a retirar es mayor al saldo, operación cancelada");
        }

    }



}