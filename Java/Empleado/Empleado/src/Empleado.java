public class Empleado{
    private String nombre;
    private double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        if(salario>0){
            this.salario = salario;
        }else{
            this.salario = 1;
            System.out.println("Salario no valido. Se asigno salario inicial de 1");
        }
        
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSalario(double salario) {
        if(salario>0){
            this.salario = salario;
        }else{
            System.out.println("Digite un numero valido para salario");
        }
        
    }

    public double calcularAumento(double porcentaje){
        if(porcentaje > 0){
            return salario * (1 + porcentaje / 100);
        }else{
            System.out.println("El porcentaje debe ser mayor que 0");
            return salario;
        }



       // return salario=(salario*porcentaje/100)+salario;

        
    }


    

    
}