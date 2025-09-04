public class Persona {
    private String nombre;
    private int edad;



    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }



    public void Saludar(){
        System.out.println("Hola mi nombre es "+nombre+" y tengo "+edad+" años de edad");
    }

    


    
}
