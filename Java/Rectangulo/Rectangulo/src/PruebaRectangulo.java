import java.util.Scanner;

public class PruebaRectangulo {
    public static void main(String[] args) throws Exception {
        Scanner lea = new Scanner (System.in);
        Rectangulo miRectangulo = new Rectangulo(0, 0); //Inicializar con valores por defecto
        
        System.out.println("Digite la base del rectangulo");
        int base=lea.nextInt();
        miRectangulo.setBase(base);

        System.out.println("Digite la altura del rectangulo");
        int altura = lea.nextInt();
        miRectangulo.setAltura(altura);
        lea.close();
        
        int resultado= miRectangulo.calcularArea();

        System.out.println("El area del rectangulo es: "+resultado);



    }
}
