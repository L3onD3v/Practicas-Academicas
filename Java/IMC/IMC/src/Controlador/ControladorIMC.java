package Controlador;

import Modelo.Persona;
import Vista.Cajas_de_Mensaje;

public class ControladorIMC {

    Persona objetoModelo;
    Cajas_de_Mensaje objetoVista;

    public ControladorIMC() {
        objetoModelo = new Persona();
        objetoVista = new Cajas_de_Mensaje();
    }

    public void iniciar() {
        objetoVista.setTitulo("Hallar el IMC");

        double altura = objetoVista.solicitarData("Digite la altura en metros");
        double peso = objetoVista.solicitarData("Digite el peso en Kg");

        objetoModelo.setEstatura(altura);
        objetoModelo.setPeso(peso);

        double IMC = objetoModelo.calcularIMC();
        String interpretacion = objetoModelo.interpretarIMC();

        objetoVista.mostrarResultado("Su indice de masa muscular es: " + IMC + " Estado: " + interpretacion);

    }

}
