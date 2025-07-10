package Controlador;

import Modelo.Prestamo;
import Vista.Cajas_de_mensaje;

public class ControladorPrestamo {
    Prestamo objPrestamo;
    Cajas_de_mensaje objetoVista;

    public ControladorPrestamo() {

        objPrestamo = new Prestamo();
        objetoVista = new Cajas_de_mensaje();
    }

    public void iniciar() {
        objetoVista.setTitulo("Calculadora financiera");

        String nombre = objetoVista.solicitarTexto("Ingrese su nombre");
        double monto = objetoVista.solicitarDouble("Ingrese el monto del prestamo");
        int cuotas = objetoVista.solicitarEntero("Digite el número de cuotas");

        objPrestamo.setDatos(nombre, monto, cuotas);

        if (cuotas < 6 || cuotas > 36) {
            objetoVista.mostrarMensaje(
                    "Número de cuotas no valido, debe estar entre 6 y 36");
            return;
        }

        double total = objPrestamo.calcularTotalPagar();
        double mensual = objPrestamo.calcularCuotaMensual();

        String resumen = "Solicitante: " + objPrestamo.getNombre() +
                "\nTotal a pagar: $" + String.format("%.2f", total) +
                "\nCuota mensual: $" + String.format("%.2f", mensual);

        objetoVista.mostrarMensaje(resumen);

    }

}
