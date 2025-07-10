public class ComparacionCadena {
    private String cadena1;
    private String cadena2;

    public ComparacionCadena() {
        this.cadena1 = "Hola";
        this.cadena2 = "ola";
    }

    public void setCadena1(String cadena1) {
        this.cadena1 = cadena1;
    }

    public void setCadena2(String cadena2) {
        this.cadena2 = cadena2;
    }

    public String getCadena1() {
        return cadena1;
    }

    public String getCadena2() {
        return cadena2;
    }

    // Metodo que retorna el caracter de la segunda posición
    // de la cadena
    public char ObtenerCaracter(int posicion) {
        char caracter = cadena2.charAt(posicion);
        return caracter;
    }

    // Metodo que compara dos cadenas Return retorna cero si son iaguales

    public String ObtenerCompareTo() {
        int res = cadena1.compareTo(cadena2);
        String respuesta = "";
        if (res == 0)
            respuesta = "Las cadenas son iguales";
        else if (res > 0) {
            respuesta = "La cadena mayor es: " + cadena1;
        } else
            respuesta = "La cadena mayor es: " + cadena2;
        return respuesta;
    }

    public boolean ObtenerComparacion() {
        if (cadena1.equals(cadena2)) {
            return true;
        } else {
            return false;
        }
    }

}
