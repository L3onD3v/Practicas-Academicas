import java.util.Scanner;

public class PruebaEmpleado {
    public static void main(String[] args) throws Exception {
        Scanner lea = new Scanner(System.in);

        System.out.println("Digite el nombre del empleado");
        String nombre = lea.nextLine();
        
        System.out.println("Digite el salario del empleado");
        double salario = lea.nextDouble();


        Empleado miEmpleado = new Empleado(nombre,salario);
        

        System.out.println("Digite cual es el porcentaje de incremento");
        double porcentaje = lea.nextDouble();

        double nuevoSalario = miEmpleado.calcularAumento(porcentaje);
        miEmpleado.setSalario(nuevoSalario);

        System.out.println("El nuevo salario de "+miEmpleado.getNombre()+" es:"+miEmpleado.getSalario());
        lea.close();

    }
}
