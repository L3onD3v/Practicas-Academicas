
@SuppressWarnings("unused")
public class Cliente {
    private String identificacion;
    private String nombre;
    private String apellido;
    private int edad;


    public Cliente(){
        this.identificacion="";
        this.nombre="";
        this.apellido="";
        this.edad=0;


    }




    
    public Cliente(String identificacion, String nombre, String apellido, int edad) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }
    public String getIdentificacion() {
        return identificacion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public int getEdad() {
        return edad;
    }





    @Override
    public String toString() {
        return "Cliente [identificacion=" + identificacion + ", nombre=" + nombre + ", apellido=" + apellido + ", edad="
                + edad + "]";
    }

    


      
    
}
