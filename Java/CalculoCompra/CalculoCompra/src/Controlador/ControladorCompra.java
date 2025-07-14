package Controlador;

import Modelo.Compra;
import Vista.Cajas_de_mensaje;

public class ControladorCompra {
    Compra objetoModelo;
    Cajas_de_mensaje objetoVista;

    public ControladorCompra() {
        objetoModelo = new Compra();
        objetoVista = new Cajas_de_mensaje();
    }

    public void iniciar() {
        objetoVista.setTitulo("Registro de conmpra");

        String cliente = objetoVista.solicitarTexto("Digit el nombre del cliente");
        String producto = objetoVista.solicitarTexto("Digite el nombre del producto");
        Double precio = objetoVista.solicitarDouble("Digite el precio del producto");
        int cantidad = objetoVista.solicitarEntero("Digite la cantidad comprada");
        double descuento = objetoVista.solicitarDouble("Digite el porcentaje de descuento (0 si no aplica)");

        objetoModelo.setDatos(cliente, producto, precio, cantidad, descuento);

        double subTotal = objetoModelo.calcularSubTotal();
        double descuentoValor = objetoModelo.calcularDescuento();
        double total = objetoModelo.calcularTotal();

        String resumen = "Cliente: " + objetoModelo.getcliente() +
                "\nProducto: " + objetoModelo.getProducto() +
                "\nSubtotal:" + String.format("%.2f", subTotal) +
                "\nDescuento" + String.format("$.2f", descuentoValor) +
                "\nTotal" + String.format("%.2f", total);

        objetoVista.mostrarMensaje(resumen);

    }

}
