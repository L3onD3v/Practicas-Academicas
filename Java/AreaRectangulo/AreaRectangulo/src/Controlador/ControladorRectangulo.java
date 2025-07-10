package Controlador;

import Modelo.Rectangulo;
import Vista.Cajas_de_Mensaje;

public class ControladorRectangulo {
    Rectangulo objetoModelo;
    Cajas_de_Mensaje objetoVista;

    public ControladorRectangulo() {
        objetoModelo = new Rectangulo();
        objetoVista = new Cajas_de_Mensaje();
    }

    public void iniciar() {
        objetoVista.setTitulo("Hallar area rectangulo");

        double largo = objetoVista.solicitarData("Ingrese el largo:");
        double ancho = objetoVista.solicitarData("ingrese el ancho:");

        objetoModelo.setlargo(largo);
        objetoModelo.setancho(ancho);

        double area = objetoModelo.calcularArea();

        objetoVista.mostrarResultado("El área del rectangulo es: " + area + " unidades cuadradas");

    }

}
