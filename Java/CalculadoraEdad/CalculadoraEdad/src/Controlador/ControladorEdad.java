package Controlador;

import Modelo.Persona;
import Vista.Cajas_de_mensaje;

public class ControladorEdad {
    Persona objetoModelo;
    Cajas_de_mensaje objetoVista;

    public ControladorEdad() {
        objetoModelo = new Persona();
        objetoVista = new Cajas_de_mensaje();
    }

    public void iniciar() {
        objetoVista.setTitulo("hallaremos tu edad actual");

        int anio = objetoVista.solicitarData("Digite su fecha de nacimiento");

        objetoModelo.setFechaNacimiento(anio);

        int resultado = objetoModelo.calcularFecha();
        String estado = objetoModelo.calculoUsuario();

        objetoVista.mostrarResultado("Tienes " + resultado + " años y " + estado + ".");
    }

}
