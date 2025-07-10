package Controlador;

import Modelo.Temperatura;
import Vista.Cajas_de_mensaje;

public class ControladorTemperatura {
    Temperatura objetoModelo;
    Cajas_de_mensaje objetoVista;

    public ControladorTemperatura() {
        objetoModelo = new Temperatura();
        objetoVista = new Cajas_de_mensaje();
    }

    public void iniciar() {
        objetoVista.setTitulo("Convertir Celsius a Fahrenheit");
        objetoModelo.setCelsius(objetoVista.solicitarCelsius("Digite los grados Celsius"));
        objetoVista.mostrarFarent("La medida es: " + objetoModelo.convetiraCelsius());
    }

}
