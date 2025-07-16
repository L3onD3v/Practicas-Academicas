package Controlador;

import Modelo.Libro;
import Vista.Cajas_de_mensaje;

public class ControladorLibro {

    Libro objetoModelo;
    Cajas_de_mensaje objetoVista;

    public ControladorLibro() {

        objetoModelo = new Libro();
        objetoVista = new Cajas_de_mensaje();
    }

    public void iniciar() {
        objetoVista.setTitulo("Resumen de los libros");

        String titulo = objetoVista.solicitarTexto("Escriba el nombre del libro");
        String autor = objetoVista.solicitarTexto("Escriba el nombre del autor");
        int paginas = objetoVista.solicitarEntero("Digite el numero de paginas");
        double valor = objetoVista.solicitarDouble("Digite el valor del libro");
        int cantidad = objetoVista.solicitarEntero("Cuantas unidades va a adquirir");

        objetoModelo.setDatos(titulo, autor, paginas, valor, cantidad);

        double valorCompra = objetoModelo.valorCompra();

        String salida = "Titulo del libro: " + objetoModelo.getTitulo() +
                "\nAutor del libro: " + objetoModelo.getAutor() +
                "\nNúmero de paginas: " + objetoModelo.getPaginas() +
                "\nValor de la compra: " + String.format("%.2f", valorCompra);

        objetoVista.mostrarMensaje(salida);

    }

}
