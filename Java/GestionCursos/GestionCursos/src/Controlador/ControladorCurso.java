package Controlador;

import Vista.Cajas_de_mensaje;

import java.util.ArrayList;

import Modelo.Curso;

public class ControladorCurso {

    private ArrayList<Curso> cursos;
    private Cajas_de_mensaje vista;

    public ControladorCurso() {
        cursos = new ArrayList<>();
        vista = new Cajas_de_mensaje();
    }

    public void iniciar() {
        vista.mostrarMensaje("Gestión de cursos");

        int cantidad = vista.solicitarEntero("¿Cuántos cursos desea registrar?");

        for (int i = 0; i < cantidad; i++) {
            String codigo;
            boolean repetido;
            do {
                repetido = false;
                codigo = vista.solicitarTexto("Digite el codigo del curso " + (i + 1));
                for (Curso c : cursos) {
                    if (c.getCodigo().equalsIgnoreCase(codigo)) {
                        vista.mostrarMensaje("El código ya existe, digite otro código");
                        repetido = true;
                        break;
                    }
                } // Cierre for II

            } // Cierre DO
            while (repetido);

            String nombre = vista.solicitarTexto("Digite el nombre del curso");
            int duracion = vista.solicitarEntero("Digite la duración del curso en horas");
            int cupos = vista.solicitarEntero("Digite la cantidad de cupos");

            cursos.add(new Curso(codigo, nombre, duracion, cupos));

        } // cierre de for

        mostrarResumen();

    }// cierre de metodo

    public void mostrarResumen() {
        StringBuilder resumen = new StringBuilder("Cursos registrados\n");
        for (Curso c : cursos) {
            resumen.append("=> ").append(c.getCodigo())
                    .append(" | ").append(c.getNombre())
                    .append(" | ").append(c.getDuracion()).append(" horas")
                    .append(" | ").append(c.getCupos())
                    .append("\n");

        }
        vista.mostrarMensaje(resumen.toString());

    }// cierre Metodo

}
