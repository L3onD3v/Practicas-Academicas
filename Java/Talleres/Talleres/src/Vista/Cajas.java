package Vista;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Cajas {
    private String titulo;

    public Cajas() {
        titulo = "";
    }

    public void setTitulo(JFrame frame, String titulo) {
        frame.setTitle(titulo);
    }

    public String solicitarTexto(String mensaje) {
        return (String) JOptionPane.showInputDialog(
                null,
                mensaje,
                titulo,
                JOptionPane.PLAIN_MESSAGE);
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
                mostrarMensaje("Digite un valor valido para el entero");
            }
        }

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
                mostrarMensaje("Digite un número valido para Double");
            }
        }
    }

    public void mostrarMensaje(String mansaje) {
        JOptionPane.showMessageDialog(null, mansaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

}
