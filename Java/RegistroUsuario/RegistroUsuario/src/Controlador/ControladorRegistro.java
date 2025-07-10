package Controlador;

import Modelo.Usuario;
import Vista.Cajas_de_mensaje;

public class ControladorRegistro {
    Usuario objetoModelo;
    Cajas_de_mensaje objetoVista;

    public ControladorRegistro() {
        objetoVista = new Cajas_de_mensaje();
        objetoModelo = new Usuario();
    }

    public void iniciar() {
        objetoVista.setTitulo("Solicitud de datos");

        String nombre = objetoVista.solicitarData("Ingrese su nombre");
        String correo = objetoVista.solicitarData("Ingrese su correo electronico");
        String contrasena = objetoVista.solicitarData("Ingrese una contraseña");
        String confirmacion = objetoVista.solicitarData("Confirme contraseña");

        objetoModelo.setDatos(nombre, correo, contrasena);

        if (!objetoModelo.validarCorreo()) {
            objetoVista.mostrarMensaje("El correo no es valido");
        } else if (!objetoModelo.validarContrasena(confirmacion)) {
            objetoVista.mostrarMensaje("Las contraséñas no coinciden");
        } else {
            objetoVista.mostrarMensaje("Registro éxitoso" + objetoModelo.getNombre());
        }

    }

}
