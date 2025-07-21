package Modelo;

import java.time.LocalDate;

public class Consulta {
    private String nombre;
    private int edad;
    private String motivo;
    private LocalDate fecha;

    public Consulta(String nombre, int edad, String motivo) {
        this.nombre = nombre;
        this.edad = edad;
        this.motivo = motivo;
        this.fecha = LocalDate.now(); // Asignar la fecha actual
    }

    public String getResumen() {
        return "Nombre: " + nombre + "\n" +
                "Edad: " + edad + "\n" +
                "Motivo: " + motivo + "\n" +
                "Fecha: " + fecha.toString();
    }

    public int getEdad() {
        return edad;
    }

}// Cierre metodo
