public class ContarVocal {
    private String cadena;

    public ContarVocal() {
        this.cadena="";
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    //Método que cuenta el número de repeticiones de la vocal "e"

    public int obtenerCantidadVocal(){
        int i = 0;
        int cantidad = 0;
        while (i<cadena.length()){
                if(cadena.charAt(i)=='e'){
                        cantidad ++;
                }
                i++;
    }
    return cantidad;
}
    






}
