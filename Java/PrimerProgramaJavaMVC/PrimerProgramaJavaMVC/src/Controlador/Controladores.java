package Controlador;

import Modelo.Convertidor;
import Vista.Cajas_de_mensaje;

public class Controladores {
    Convertidor objetomodelo;
    Cajas_de_mensaje objetovista;

    public Controladores() {
        objetomodelo = new Convertidor();
        objetovista = new Cajas_de_mensaje();
    }

    public void iniciar() {
        objetovista.setTitulo("Convertir metros a centimetros");
        objetomodelo.setValor(objetovista.solicitarMetros("Digite la medida en metros"));
        objetovista.mostrarCentimetros("La medida en centimetros es: " + objetomodelo.convertiraCentimetros());

    }

}
