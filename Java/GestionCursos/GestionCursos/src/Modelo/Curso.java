package Modelo;

public class Curso {
    private String codigo;
    private String nombre;
    private int duracion;
    private int cupos;

    public Curso(String codigo, String nombre, int duracion, int cupos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.duracion = duracion;
        this.cupos = cupos;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getCupos() {
        return cupos;
    }

}
