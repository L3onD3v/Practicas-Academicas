package Controlador;

import Vista.Cajas_de_mensaje;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import Modelo.Reserva;

public class ControladorReserva {
    private ArrayList<Reserva> reservas;
    private Cajas_de_mensaje vista;

    public ControladorReserva() {
        reservas = new ArrayList<>();
        vista = new Cajas_de_mensaje();
    }

    public void iniciar(){
        vista.setTitulo("Gestión de reservas de hotel");



        int cantidad = vista.solicitarEntero("Cuántas reservas desea registrar");

        for (int i = 0;i < cantidad;i++){
            int habitacion;
            boolean repetido;
            do{
                repetido = false;
                String nombre = vista.solicitarTexto("Digite el nombre del huesped");
                habitacion = vista.solicitarEntero("Digite el número de la habitación");
                String fechaReserva = vista.solicitarTexto("Digite la fecha de la reserva");
                DateTimeFormatter formatear = DateTimeFormatter.ofPattern("dd/mm/yyy");
                LocalDate fecha = LocalDate.parse(fechaReserva,formatear);


                



            }//Cierre do


        }//Cierre for











    }// Cierre iniciar

}
