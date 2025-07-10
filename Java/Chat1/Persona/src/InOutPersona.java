import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InOutPersona {
    private Persona nuevaPersona;


    public InOutPersona(){
        this.nuevaPersona = new Persona();

    }

    public void obtenerDatos() throws IOException{
        int inEdad = 0;
        String nombreIn = "";



        BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Digite su nombre: ");
        nombreIn = teclado.readLine();
        System.out.println("Digite la edad: ");
        inEdad = Integer.parseInt(teclado.readLine());
        nuevaPersona.setEdad(inEdad);
        nuevaPersona.setNombre(nombreIn);

        System.out.println("Este es el rsultado obtenido");
        System.out.println("El nombre digitado es: "+ nuevaPersona.getNombre());
        System.out.println("La edad digitada es: "+ nuevaPersona.getEdad());


    }


}
