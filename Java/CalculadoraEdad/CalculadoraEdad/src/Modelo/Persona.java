package Modelo;

import java.time.Year;

public class Persona {
    private int fechaNacimiento;
    private int anioUsuario = Year.now().getValue();

    public void setFechaNacimiento(int fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int calcularFecha() {
        return anioUsuario - fechaNacimiento;
    }

    public String calculoUsuario() {
        int validacion = calcularFecha();
        return (validacion >= 18) ? "eres mayor de edad" : "eres un chico todavía";

    }

}
