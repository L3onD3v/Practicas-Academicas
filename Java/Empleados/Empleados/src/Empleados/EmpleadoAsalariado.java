package Empleados;

public class EmpleadoAsalariado extends Empleado{
    double salariomensual;


    public EmpleadoAsalariado(String nombre, String documento, double salariomensual) {
        super(nombre, documento);
        this.salariomensual = salariomensual;
    }


    @Override
    public double calcularSalario(){
        return salariomensual;
    }










    
}
