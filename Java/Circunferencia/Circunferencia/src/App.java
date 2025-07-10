public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        double numero1 = 1.0;
        double numero2 = 3.5;



        // Calculando e^1 usando Math.E
        double resultado = Math.pow(Math.E, numero1);

        System.out.println("e^" + numero1 + " = " + resultado);
        System.out.println("Segundo intento: "+(Math.exp(numero2)));
    }
}
