public class Cadena {
    private String cadena;

    public Cadena(String cadena) {
        this.cadena = cadena;
    }

    public Cadena() {
        this.cadena = " ";
    }

    public char imprimirPrimerElemento() {
        if (cadena != null && !cadena.isEmpty()) {
            return cadena.charAt(0);
        } else {
            System.out.println("La cadena está vacia");
            return '?';
        }
    }

    public char imprimirTercerElemento() {
        if (cadena != null && !cadena.isEmpty()) {
            return cadena.charAt(2);
        } else {
            System.out.println("La cadena está vacia");
            return '?';
        }
    }

    public char imprimirUltimoElemento() {
        if (cadena != null && !cadena.isEmpty()) {
            return cadena.charAt(cadena.length() - 1);
        } else {
            System.out.println("La cadena está vacia");
            return '?';
        }
    }

    public char imprimirElementosImpares() {
        if (cadena != null && !cadena.isEmpty()) {
            return cadena.charAt(cadena.length() - 1);
        } for(i)
        
        else {
            System.out.println("La cadena está vacia");
            return '?';
        }
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }

}