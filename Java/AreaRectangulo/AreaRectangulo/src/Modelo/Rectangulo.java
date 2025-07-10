package Modelo;

public class Rectangulo {

    private double largo;
    private double ancho;

    public void setlargo(double largo) {
        this.largo = largo;
    }

    public void setancho(double ancho) {
        this.ancho = ancho;
    }

    public double calcularArea() {
        return largo * ancho;
    }

}