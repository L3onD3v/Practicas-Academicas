package Empleados;

public class EmpleadoPorHoras extends Empleado{
    int horasTrabajadas;
    double valorHora;



    
    public EmpleadoPorHoras(String nombre, String documento, int horasTrabajadas, double valorHora) {
        super(nombre, documento);
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
    }


    @Override
    public double calcularSalario(){
        return horasTrabajadas * valorHora;
    }
}