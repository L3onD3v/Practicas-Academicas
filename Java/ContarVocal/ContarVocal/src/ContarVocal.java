public class ContarVocal{
    private String cadena;


    //Constructor que inicializa la cadena con un espacio en blanco
    public ContarVocal(){
        this.cadena = "";
    }


   


    //Metodo que actualiza el contenido de la cadena
    public void setCadena(String cadena) {
        this.cadena = cadena;
    }





    public String getCadena() {
        return cadena;
    }



    public int ObtenerCantidadVocal(){
        int cantidad = 0;
        for(int i=0;i<cadena.length();i++){
            if(cadena.charAt(i)=='e'){
                cantidad++;
            }
        }
        return cantidad;
    }
}