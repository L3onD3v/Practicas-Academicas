package Vista;

import javax.swing.JOptionPane;

public class Cajas_de_mensaje {
    private String titulo;

    public Cajas_de_mensaje() {
        titulo = "";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String solicitarData(String mensaje) {
        return (String) JOptionPane.showInputDialog(null,
                mensaje,
                titulo,
                JOptionPane.PLAIN_MESSAGE,
                null,
                null,
                "");
    }

    public void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(
                null,
                mensaje,
                titulo,
                JOptionPane.INFORMATION_MESSAGE);
    }

}
