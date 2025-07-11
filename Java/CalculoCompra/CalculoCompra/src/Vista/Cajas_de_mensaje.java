package Vista;

import javax.swing.JOptionPane;

public class Cajas_de_mensaje {
    private String titulo;

    public Cajas_de_mensaje() {
        titulo = "";
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public String solicitarTexto(String mensaje) {
        return (String) JOptionPane.showInputDialog(
                null,
                mensaje,
                titulo,
                JOptionPane.PLAIN_MESSAGE);
    }

    public double solicitarDouble(String mensaje) {
        while (true) {
            try {
                return Double.parseDouble(JOptionPane.showInputDialog(
                        null,
                        mensaje,
                        titulo,
                        JOptionPane.PLAIN_MESSAGE));
            } catch (NumberFormatException e) {
                mostrarMensaje("Error: Ingrese un número valido");
            }
        }
    }

    public int solicitarEntero(String mensaje) {
        while (true) {
            try {
                return Integer.parseInt(JOptionPane.showInputDialog(
                        null,
                        mensaje,
                        titulo,
                        JOptionPane.PLAIN_MESSAGE));
            } catch (NumberFormatException e) {
                mostrarMensaje("Error: ingrese un número válido");

            }
        }
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(
                null,
                mensaje,
                titulo,
                JOptionPane.INFORMATION_MESSAGE);

    }

}
