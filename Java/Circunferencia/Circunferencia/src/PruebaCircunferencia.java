import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PruebaCircunferencia {
    private Circunferencia unaCircunferencia;

    public PruebaCircunferencia(){
        this.unaCircunferencia = new Circunferencia();
    }

    /**
 * Lee el contenido de un archivo.
 *
 * @throws IOException 
 */

    //Metodo que realiza la lectura e impresión de los resultados
    
    public void procesarDatos() throws IOException{
        double radio = 0;
        String numero = "";
        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite el valor del radio");
        numero = teclado.readLine();
        radio = Double.parseDouble(numero);
        unaCircunferencia.setRadio(radio); 

        System.out.println("Este es un ejemplo de Math.E");
       
        
    }
}
