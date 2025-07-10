@SuppressWarnings("unused")
public class PruebaCliente {
    public static void main(String[] args) throws Exception {
        Cliente unCliente = new Cliente("Oscar","Hernandez",12);
        System.out.println("Datos cliente"+unCliente.toString());

        unCliente.setNombre("Mario");
        unCliente.setApellido("Cabrera");
        unCliente.setEdad(41);

        System.out.println("Nombre: "+unCliente.getNombre());
        System.out.println("Apellido: "+unCliente.getApellido());
        System.out.println("Edad: "+unCliente.getEdad());

        System.out.println("Datos del cliente: "+ unCliente.toString());

    }
}
