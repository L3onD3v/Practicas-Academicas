public class ContarVocal {
    private String cadena;

    public ContarVocal(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }


    
    public int obtenerCantidadVocal(){
        int i = 0;
        int cantidad = 0;
        do{
            if(cadena.charAt(i)=='e'){
                cantidad++;
            }
            i++;
        }
        while(i<cadena.length());
        return cantidad;

    }
}
