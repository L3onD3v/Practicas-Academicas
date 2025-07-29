package Modelo;

import java.time.LocalDate;

public class Inscripcion {
    private String participante;
    private String taller;
    private LocalDate fecha;
    private String telefono;

    public Inscripcion(String participante, String taller, LocalDate fecha, String telefono) {
        this.participante = participante;
        this.taller = taller;
        this.fecha = fecha;
        this.telefono = telefono;
    }

    public String getTaller() {
        return taller;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public String getResumen() {
        return participante + " | " + taller + "| " + fecha + " | Tel: " + telefono;
    }

}
