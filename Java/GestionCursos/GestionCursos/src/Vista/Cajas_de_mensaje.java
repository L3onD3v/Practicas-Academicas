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
                mostrarMensaje("Digite un número decimal valido");
            }
        }

    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

}
