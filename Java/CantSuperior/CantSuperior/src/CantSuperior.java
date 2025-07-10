public class CantSuperior {
    private int numero;

    public CantSuperior(){
        this.numero = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    
    public String esMayor(){
        String respuesta = (numero > 150000)?" es mayor":" es menor que 150.000";
        return respuesta;
    }
}
