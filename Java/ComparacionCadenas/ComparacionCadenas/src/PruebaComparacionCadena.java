import java.util.Scanner;

public class PruebaComparacionCadena {

    private ComparacionCadena unaCadena;

    public PruebaComparacionCadena() {
        this.unaCadena = new ComparacionCadena();
    }

    // Metodo que realiza la lectura de las cadenas
    // Impresión de resultados

    public void leerCadenas() {
        String cadena1;
        String cadena2;

        Scanner lea = new Scanner(System.in);
        char caracter;
        boolean cadenasiguales = false;
        String ComparacionCadena = "";
        // String cambioLetras = "";
        String segundaComparacion = "";

        // Se lee la primera cadena
        System.out.println("Digite la primera cadena");
        cadena1 = lea.nextLine();
        System.out.println("Digite la segunda cadena");
        cadena2 = lea.nextLine();

        lea.close();

        this.unaCadena.setCadena1(cadena1);
        this.unaCadena.setCadena2(cadena2);

        caracter = unaCadena.ObtenerCaracter(1);

        ComparacionCadena = unaCadena.ObtenerCompareTo();

        cadenasiguales = unaCadena.ObtenerComparacion();

        if (cadenasiguales == true) {
            segundaComparacion = "Cadenas iguales";
        } else {
            segundaComparacion = "Cadenas diferentes";
        }

        // Impresión de resultados
        System.out.println("Primera cadena " + unaCadena.getCadena1() + "\n" +
                "Segunda cadena " + unaCadena.getCadena2() + "\n" +
                "caracter de la posición dos de la cadena 1 " + caracter + "\n" +
                "Comparación de cadenas metodo CompareTo: " + ComparacionCadena + "\n" +
                "Segunda comparacion de cadenas con el metodo equals()" + segundaComparacion + "\n");

    }

    public static void main(String[] args) {
        PruebaComparacionCadena prueba = new PruebaComparacionCadena();
        prueba.leerCadenas();
    }

}
