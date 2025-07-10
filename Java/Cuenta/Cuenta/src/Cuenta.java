
@SuppressWarnings("unused")
public class Cuenta {
    private double saldo;



public Cuenta(){

    this.saldo = 0;
}


public Cuenta(double cantidad){

    this.saldo = cantidad;
}

public void consignar(double cantidad){
    saldo = saldo+cantidad;
}


public void retirar(double cantidad){
    saldo = saldo-cantidad;
}

public double obtenerSaldo(){
    return saldo;
}

}
