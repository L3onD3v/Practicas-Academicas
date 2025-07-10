package app;

import Controlador.ControladorTemperatura;

public class App {
    public static void main(String[] args) throws Exception {
        ControladorTemperatura objetoControlador = new ControladorTemperatura();
        objetoControlador.iniciar();
    }
}
