package Modelo;

import java.time.LocalDate;

public class Reserva {
    private String nombre;
    private int numero;
    LocalDate fecha;
    private int noches;

    public Reserva(String nombre, int numero, LocalDate fecha, int noches) {
        this.nombre = nombre;
        this.numero = numero;// Numero de habitación
        this.fecha = fecha;
        this.noches = noches; // Numero de noches
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumero() {
        return numero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getNoches() {
        return noches;
    }

    public String getResumen() {
        return "Nombre" + nombre + "\n" +
                "Número de la habitación" + numero + "\n" +
                "fecha de la reserva" + fecha + "\n" +
                "Número de noches" + noches + "\n";

    }

}
