package Modelo;

public class Curso {
    private int codigo;
    private String nombre;
    private double duracion;
    private int cupos;

    public Curso(int codigo, String nombre, double duracion, int cupos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.duracion = duracion;
        this.cupos = cupos;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getDuracion() {
        return duracion;
    }

    public int getCupos() {
        return cupos;
    }

}
