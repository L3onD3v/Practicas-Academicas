package Controlador;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import Modelo.Consulta;
import Vista.Cajas_de_mensaje;

public class ControladorConsulta {

    private Cajas_de_mensaje vista;
    private ArrayList<Consulta> consultas;

    public ControladorConsulta() {
        vista = new Cajas_de_mensaje();
        consultas = new ArrayList<>();
    }

    public void iniciar() {
        vista.setTitulo("Registro de Consultas Médicas ");

        int cantidad = vista.solicitarEntero("Ingrese la cantidad de consultas a registrar:");
        for (int i = 0; i < cantidad; i++) {
            String nombre = vista.solicitarTexto("Ingrese el nombre del paciente:" + (i + 1));
            int edad = vista.solicitarEntero("Ingrese la edad del paciente:" + (i + 1));
            String motivo = vista.solicitarTexto("Ingrese el motivo de la consulta:");

            consultas.add(new Consulta(nombre, edad, motivo));

        }

        guardarArchivo();
        mostrarResumen();
    }

    private void guardarArchivo() {
        try (FileWriter fw = new FileWriter("consultas.txt", true)) {
            for (Consulta c : consultas) {
                fw.write(c.getResumen() + "\n");
            }
        } catch (IOException e) {
            vista.mostrarMensaje("Error al guardar el archivo: " + e.getMessage());
        }
    }

    private void mostrarResumen() {
        int totalEdad = 0;
        StringBuilder resumen = new StringBuilder("Resumen de Consultas:\n");

        for (Consulta c : consultas) {
            resumen.append(" - ").append(c.getResumen()).append("\n");
            totalEdad += c.getEdad();
        }

        double promedio = (double) totalEdad / consultas.size();
        resumen.append("\nTotal de pacientes").append(consultas.size())
                .append("\nPromedio de edad: ").append(String.format("%.2f", promedio));
        vista.mostrarMensaje(resumen.toString());

    }
}
