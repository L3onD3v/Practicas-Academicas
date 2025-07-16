package Modelo;

public class Estudiante {
    private String nombre;
    private int edad;
    private String programa;

    public Estudiante(String nombre, int edad, String programa) {
        this.nombre = nombre;
        this.edad = edad;
        this.programa = programa;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPrograma() {
        return programa;
    }

}
