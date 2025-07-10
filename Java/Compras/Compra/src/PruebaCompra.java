import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("unused")
public class PruebaCompra {
    private Compra unaCompra;

    public PruebaCompra(){
        this.unaCompra = new Compra();
    }

    public void imprimirResultados() throws IOException{
        double compra1;

        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite el valor de la compra: ");
        compra1 = Integer.parseInt(teclado.readLine());
        

    }

}
