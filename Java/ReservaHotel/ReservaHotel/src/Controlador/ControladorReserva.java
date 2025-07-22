package Controlador;

import Vista.Cajas_de_mensaje;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;

import Modelo.Reserva;

public class ControladorReserva {
    private ArrayList<Reserva> reservas;
    private Cajas_de_mensaje vista;

    public ControladorReserva() {
        reservas = new ArrayList<>();
        vista = new Cajas_de_mensaje();
    }

    public void iniciar() {
        vista.setTitulo("Gestión de reservas de hotel");

        int cantidad = vista.solicitarEntero("Cuántas reservas desea registrar");

        for (int i = 0; i < cantidad; i++) {
            String nombre = vista.solicitarTexto("Digite el nombre del huesped");
            int habitacion = vista.solicitarEntero("Digite el número de la habitación");
            String fechaTexto = vista.solicitarTexto("Fecha de reserva (AAAA=MM-DD)");
            // DateTimeFormatter formatear = DateTimeFormatter.ofPattern("dd/mm/yyy");
            LocalDate fecha = LocalDate.parse(fechaTexto);
            int noches = vista.solicitarEntero("Dinigite el número de noches");
            boolean repetida = false;

            for (Reserva r : reservas) {
                if (r.getnumeroHabitacion() == habitacion && r.getFecha().equals(fecha)) {
                    repetida = true;
                    break;
                }
            }
            if (repetida) {
                vista.mostrarMensaje("Ya existe una reserva para esa habitación en esa fecha");
                i--;
            } else {
                reservas.add(new Reserva(nombre, habitacion, fecha, noches));
            }

        } // Cierre for
        guardarArchivo();
        mostrarResumen();

    }// Cierre iniciar

    private void guardarArchivo() {
        try (FileWriter fw = new FileWriter("reservas.txt", true)) {
            for (Reserva r : reservas) {
                fw.write(r.getResumen() + "\n");
            }
        } catch (IOException e) {
            vista.mostrarMensaje("Error al guardar archivo" + e.getMessage());
        }
    }

    private void mostrarResumen() {
        StringBuilder resumen = new StringBuilder("Resumen de reservas");
        int totalNoches = 0;

        for (Reserva r : reservas) {
            resumen.append(" - ").append(r.getResumen()).append(reservas.size());
            totalNoches += r.getNoches();
        }

        resumen.append("\n Total de reservas: ").append(reservas.size());
        resumen.append("\nTotal noches reservadas: ").append(totalNoches);

        vista.mostrarMensaje(resumen.toString());
    }

}
