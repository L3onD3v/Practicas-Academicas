package Modelo;

public class Temperatura {
    private double Celsius;

    public Temperatura(double Celsius) {
        this.Celsius = Celsius;
    }

    public Temperatura() {
        this.Celsius = 0.0;
    }

    public double getCelsius() {
        return Celsius;
    }

    public void setCelsius(double Celsius) {
        this.Celsius = Celsius;
    }

    public double convetiraCelsius() {
        return (Celsius * 9 / 5) + 32;
    }

}
