package App;

import Controlador.ControladorLibro;

public class App {
    public static void main(String[] args) throws Exception {
        ControladorLibro controlador = new ControladorLibro();
        controlador.iniciar();
    }
}
