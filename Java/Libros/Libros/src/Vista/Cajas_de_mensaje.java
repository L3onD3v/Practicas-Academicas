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

    public int solicitarEntero(String mensaje) {
        return Integer.parseInt(JOptionPane.showInputDialog(
                null,
                mensaje,
                titulo,
                JOptionPane.PLAIN_MESSAGE));
    }

    public String solicitarTexto(String mensaje) {
        return (String) JOptionPane.showInputDialog(
                null,
                mensaje,
                titulo,
                JOptionPane.PLAIN_MESSAGE);
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(
                null,
                mensaje,
                titulo,
                JOptionPane.INFORMATION_MESSAGE);
    }

    public double solicitarDouble(String mensaje) {
        return Double.parseDouble(JOptionPane.showInputDialog(
                null,
                mensaje,
                titulo,
                JOptionPane.PLAIN_MESSAGE));
    }

}
