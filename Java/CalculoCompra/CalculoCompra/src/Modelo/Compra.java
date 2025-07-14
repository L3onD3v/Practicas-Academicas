package Modelo;

public class Compra {
    private String nombre;
    private String producto;
    private double precioUnitario;
    private int cantidad;
    private double descuento;

    public void setDatos(String nombre, String producto, Double precioUnitario, int cantidad, double descuento) {
        this.nombre = nombre;
        this.producto = producto;
        this.precioUnitario = precioUnitario;
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

    public String getNombre() {
        return nombre;
    }

    public String getProducto() {
        return producto;
    }

}
