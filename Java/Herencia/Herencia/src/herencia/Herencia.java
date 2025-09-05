package herencia;
public class Herencia {
    public static void main(String[] args) throws Exception {
        Empleado emple = new Empleado();



        emple.getNum_legajo();
        emple.getApellido();


        Consultor consul = new Consultor();
        consul.getDomicilio();
        consul.getNombre_consultora();
        
    }
}
