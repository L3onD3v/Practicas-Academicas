package Modelo;

public class Estudiante {
    private String nombre;
    private String asignatura;
    private double nota1,nota2,nota3;



    public void setDatos(String nombre, String asignatura, double n1, double n2, double n3) {
        this.nombre = nombre;
        this.asignatura = asignatura;
        this.nota1 = n1;
        this.nota2 = n2;
        this.nota3 = n3;
    }


    public double calcularPromedio(){
        return (nota1+nota2+nota3)/3;
    }

    public String evaluarDesempeno(){
        double promedio = calcularPromedio();

        if (promedio <=3.0) return "Reprobado";
        else if(promedio >= 4.0) return " Aprobado";
        else return "Excelente";
    }


    public String getNombre() {
        return nombre;
    }


    public String getAsignatura() {
        return asignatura;
    }


    





    







}
