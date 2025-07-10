package Controlador;

import Modelo.Usuario;
import Vista.Cajas_de_mensaje;

public class ControladorRegistro {
    Usuario objetoModelo;
    Cajas_de_mensaje objetoVista;

    public ControladorRegistro() {
        objetoVista = new Cajas_de_mensaje();
        objetoModelo = new Usuario(null, null, null);
    }

    public void iniciar() {
        objetoVista.setTitulo("Solicitud de datos");

        String nombre = objetoVista.solicitarData("Ingrese su nombre");
        String correo = objetoVista.solicitarData("Ingrese su correo electronico");
        String contrasena = objetoVista.solicitarData("Ingrese una contrtaséña");
        String confirmacion = objetoVista.solicitarData("Confirme contraséña");

        objetoModelo.Usu

    }

}
