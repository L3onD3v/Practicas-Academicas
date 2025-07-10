package Modelo;

public class Prestamo {
    private String nombre;
    private double monto;
    private int cuotas;
    private double tasaInteres = 0.12;

    public void setDatos(String nombre, double monto, int cuotas) {
        this.nombre = nombre;
        this.monto = monto;
        this.cuotas = cuotas;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularTotalPagar() {
        double anios = cuotas / 12.0;
        return monto + (monto * tasaInteres * anios);
    }

    public double calcularCuotaMensual() {
        return calcularTotalPagar() / cuotas;
    }

}
