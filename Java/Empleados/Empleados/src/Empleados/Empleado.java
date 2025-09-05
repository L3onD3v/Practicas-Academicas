
package Empleados;

public class Empleado {
    String nombre;
    String documento;

    

    public Empleado() {
    }

    public Empleado(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public double calcularSalario(){
        return 0.0;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Documento: "+documento);
    }

    


    
}
