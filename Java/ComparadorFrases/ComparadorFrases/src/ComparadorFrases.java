
public class ComparadorFrases {

    private String frase1;
    private String frase2;

    public ComparadorFrases() {
        this.frase1 = "frase1";
        this.frase2 = "frase2";
    }

    public void setFrase1(String frase1) {
        this.frase1 = frase1;
    }

    public void setFrase2(String frase2) {
        this.frase2 = frase2;
    }

    public String getFrase1() {
        return frase1;
    }

    public String getFrase2() {
        return frase2;
    }

    public int contarVocales(String frase) {
        int contador = 0;
        String vocales = "aeiouAEIOU";

        for (int i = 0; i < frase.length(); i++) {
            if (vocales.contains(String.valueOf(frase.charAt(i))))
                contador++;
        }

        return contador;
    }

    public String compararLongitud() {
        int res = frase1.compareTo(frase2);
        String respuesta = "";
        if (res == 0)
            respuesta = "Las cadenas son iguales";
        else if (res > 0) {
            respuesta = "La cadena mayor es: " + frase1;
        } else
            respuesta = "La cadena mayor es: " + frase2;
        return respuesta;

    }

    public boolean contieneFrase() {
        return frase1.contains(frase2) || frase2.contains(frase1);

    }

}