package Controlador;

import java.util.ArrayList;

import Modelo.Estudiante;
import Vista.Cajas;

public class ControladorEstudiantes {
    private ArrayList<Estudiante> estudiantes;
    private Cajas vista;

    public ControladorEstudiantes() {

        estudiantes = new ArrayList<>();
        vista = new Cajas();
    }

    public void iniciar() {
        vista.setTitulo("Gestión de estudiantes");

        int cantidad = vista.solicitarEntero("¿Cuántos estudiantes desea registrar?");
        for (int i = 0; i < cantidad; i++) {
            String nombre = vista.solicitarTexto("Digite el nombre del estudiante => " + (i + 1));
            int edad = vista.solicitarEntero("Digite la edad del estudiante " + (i + 1));
            String programa = vista.solicitarTexto("Digite el nombre del programa");

            estudiantes.add(new Estudiante(nombre, edad, programa));

        }

        mostrarResumen();

    }

    private void mostrarResumen() {
        int totalEdad = 0;
        StringBuilder resumen = new StringBuilder("Resumen de estudiantes\n");

        for (Estudiante est : estudiantes) {
            resumen.append("=> ").append(est.getNombre())
                    .append(" - ").append(est.getEdad()).append(" años")
                    .append(" -").append(est.getPrograma()).append("\n");
            totalEdad += est.getEdad();
        }

        double promedio = (double) totalEdad / estudiantes.size();
        resumen.append("\nCantidad total: ").append(estudiantes.size());
        resumen.append("\nPromedio de edad: ").append(String.format("%.2f", promedio));

        vista.mostrarMensaje(resumen.toString());

    }
}
