import java.util.Scanner;

public class PruebaCalculadora {
    private Calculadora cassio;


    public PruebaCalculadora(){
        this.cassio = new Calculadora();
    }

    public void obtenerOperaciones(){
        double a = 0;
        double b = 0;

        Scanner lector = new Scanner (System.in);
        double resultado;

        System.out.println("Por favor digite el primer valor");
        a = lector.nextDouble();

        System.out.println("Por favor digite el segundo valor");
        b = lector.nextDouble();

        lector.close();

        cassio.setX(a);
        cassio.setY(b);

        resultado = cassio.obtenerSuma();
        System.out.println("El resultado de la suma es: "+resultado);

        resultado = cassio.obtenerRestas();
        System.out.println("El resultado de la resta es: "+resultado);

        resultado = cassio.obtenerProducto();
        System.out.println("El resultado de la multiplicacion es: "+resultado);

        resultado = cassio.obtenerDivision();
        System.out.println("El resultado de la división es: "+resultado);
    }
}

