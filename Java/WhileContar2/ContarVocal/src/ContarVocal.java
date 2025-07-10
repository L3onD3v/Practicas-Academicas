public class ContarVocal {
    private String cadena;

    public ContarVocal() {
        this.cadena = "";
    }

    public ContarVocal(String cadena) {
        this.cadena = cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public int obtenerCantidadVocal(){
        int i = 0;
        int cantidad = 0;
        while(i < cadena.length()){
            if(cadena.charAt(i) == 'e'){
                cantidad++;
            }
            i++;
        }
        return cantidad;
        


    }
}
