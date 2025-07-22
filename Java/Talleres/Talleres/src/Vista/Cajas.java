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

}
