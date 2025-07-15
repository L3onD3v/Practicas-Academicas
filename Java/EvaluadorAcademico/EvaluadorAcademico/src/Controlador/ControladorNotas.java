package Controlador;

import Modelo.Estudiante;
import Vista.Cajas_de_mensaje;

public class ControladorNotas {
    Estudiante objetoModelo;
    Cajas_de_mensaje objetoVista;



    public ControladorNotas() {
        objetoVista = new Cajas_de_mensaje();
        objetoModelo = new Estudiante();
    }



    public void iniciar(){

        objetoVista.setTitulo("Evaluador Academico");


        String nombre = objetoVista.solicitarTexto(" Digite el nombre del estudiante");
        String asignatura = objetoVista.solicitarTexto("Digite el nombre de la materia");
        double n1 = objetoVista.solicitarDouble("Digite la primera nota");
        double n2 = objetoVista.solicitarDouble("Digite la segunda nota");
        double n3 = objetoVista.solicitarDouble("Digite la primera nota");

        objetoModelo.setDatos(nombre, asignatura, n1, n2, n3);

        double promedio = objetoModelo.calcularPromedio();
        String resultado = objetoModelo.evaluarDesempeno();

        String mensaje =    "Estudiante: "+objetoModelo.getNombre()+
                            "\nAsignatura: "+objetoModelo.getAsignatura()+
                            "\nPromedio: "+String.format("%.2f", promedio)+
                            "\nEstado: "+resultado;
        
        objetoVista.mostrarMensaje(mensaje);









    }



    





    
}
