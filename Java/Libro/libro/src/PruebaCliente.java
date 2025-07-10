public class PruebaCliente {
    public static void main(String[] args) throws Exception {
        Cliente unCliente = new Cliente();
        Cliente otroCliente = new Cliente("123456","Alan","Brito",30);

        System.out.println(otroCliente.getIdentificacion());
        

    }
}
