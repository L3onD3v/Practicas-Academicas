package App;

import Controlador.ControladorConsulta;

public class App {
    public static void main(String[] args) throws Exception {
        ControladorConsulta controlador = new ControladorConsulta();
        controlador.iniciar();
    }
}
