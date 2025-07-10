public class NumeroPar{
    private int numero;

    public NumeroPar(){
        this.numero = 0;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    /*Metodo que evalua si un numero es par o impar
     * utilizando el operador Alternativa 
     * @return
     */
    public String evaluarNumero(){
        String respuesta = ((numero % 2 == 0)? "Par":"Impar");
        return respuesta;
    }

    /*Metodo que evalua si el numero es par o impar
     * utilizando la funcion if else
     */


     public String esParimpar(){
        String respuesta = "";
        if(numero % 2 == 0){
            respuesta = "par";
        }else{
            respuesta = "impar";
        }
        return respuesta;
     }

}