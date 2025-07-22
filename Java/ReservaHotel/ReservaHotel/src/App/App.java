package App;

import Controlador.ControladorReserva;

public class App {
    public static void main(String[] args) throws Exception {
        ControladorReserva controlador = new ControladorReserva();
        controlador.iniciar();
    }
}
