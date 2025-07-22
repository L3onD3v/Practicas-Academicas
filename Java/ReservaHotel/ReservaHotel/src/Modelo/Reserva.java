package Modelo;

import java.time.LocalDate;

public class Reserva {
    private String nombre;
    private int numeroHabitacion;
    LocalDate fecha;
    private int noches;

    public Reserva(String nombre, int numeroHabitacion, LocalDate fecha, int noches) {
        this.nombre = nombre;
        this.numeroHabitacion = numeroHabitacion;// numeroHabitacion de habitación
        this.fecha = fecha;
        this.noches = noches; // numeroHabitacion de noches
    }

    public String getNombre() {
        return nombre;
    }

    public int getnumeroHabitacion() {
        return numeroHabitacion;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public int getNoches() {
        return noches;
    }

    public String getResumen() {
        return "Nombre: " + nombre + "\n" +
                "Número de la habitación: " + numeroHabitacion + "\n" +
                "fecha de la reserva: " + fecha + "\n" +
                "Número de noches; " + noches + "\n";

    }

}
