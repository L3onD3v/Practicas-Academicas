package Empleados;

public class Main {
    public static void main(String[] args) throws Exception {
        Empleado emp1 = new EmpleadoAsalariado("Leon", "12345", 2500000);
        Empleado emp2 = new EmpleadoPorHoras("Karen", "6789087", 160, 20000);

        emp1.mostrarDatos();
        System.out.println("Salario: $"+emp1.calcularSalario());


        System.out.println("-------------------------------------------");


        emp2.mostrarDatos();
        System.out.println("Salario: $"+emp2.calcularSalario());



    }
}
