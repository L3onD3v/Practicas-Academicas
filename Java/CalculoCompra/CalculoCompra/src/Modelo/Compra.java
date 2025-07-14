package Modelo;

public class Compra {
    private String cliente;
    private String producto;
    private double precioUnitario;
    private int cantidad;
    private double descuento;

    public void setDatos(String cliente, String producto, Double precio, int cantidad, double descuento) {
        this.cliente = cliente;
        this.producto = producto;
        this.precioUnitario = precio;
        this.cantidad = cantidad;
        this.descuento = descuento;
    }

    public double calcularSubTotal() {
        return precioUnitario * cantidad;
    }

    public double calcularDescuento() {
        return calcularSubTotal() * (descuento / 100);
    }

    public double calcularTotal() {
        return calcularSubTotal() - calcularDescuento();
    }

    public String getcliente() {
        return cliente;
    }

    public String getProducto() {
        return producto;
    }

}
