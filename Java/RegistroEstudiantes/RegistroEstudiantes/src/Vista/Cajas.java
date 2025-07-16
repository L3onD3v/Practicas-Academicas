package Vista;

import javax.swing.JOptionPane;

public class Cajas {
    private String titulo;

    public Cajas() {
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
                mostrarMensaje("Digite un valor válido");
            }
        }
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(null,
                mensaje,
                titulo,
                JOptionPane.INFORMATION_MESSAGE);
    }

}
