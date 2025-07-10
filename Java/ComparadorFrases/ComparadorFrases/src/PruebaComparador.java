import java.util.Scanner;

public class PruebaComparador {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ComparadorFrases comparador = new ComparadorFrases();

        System.out.println("Ingrese la primera frase");
        String input1 = lector.nextLine();
        comparador.setFrase1(input1);

        System.out.println("Ingrese la frase dos");
        String input2 = lector.nextLine();
        comparador.setFrase2(input2);

        lector.close();

        System.out.println("---Resultados---");
        System.out.println("Vocales en frase 1 = "
                + comparador.contarVocales(comparador.getFrase1()));

        System.out.println("Vocales en la frase 2 = "
                + comparador.contarVocales(comparador.getFrase2()));

        System.out.println("Comparar longitud"
                + comparador.compararLongitud());

        System.out.println("Una frase contiene la otra?"
                + (comparador.contieneFrase() ? " Si" : " No"));

    }
}
