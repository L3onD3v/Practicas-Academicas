package Modelo;

public class Persona {
    private double peso;
    private double estatura;

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double calcularIMC() {
        return peso / (estatura * estatura);
    }

    public String interpretarIMC() {
        double imc = calcularIMC();

        if (imc < 18.5)
            return "Bajo peso";
        else if (imc < 25)
            return "Normal";
        else if (imc < 25)
            return "Sobrepeso";
        else
            return "Obesidad";

    }

}