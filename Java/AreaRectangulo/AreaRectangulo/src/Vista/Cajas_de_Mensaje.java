package Vista;

import javax.swing.JOptionPane;

public class Cajas_de_Mensaje {
    private String titulo;

    public Cajas_de_Mensaje() {
        titulo = "";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double solicitarData(String mensaje) {
        return Double.parseDouble(JOptionPane.showInputDialog(
                null,
                mensaje,
                titulo,
                JOptionPane.PLAIN_MESSAGE));
    }

    public void mostrarResultado(String mensaje) {
        JOptionPane.showMessageDialog(
                null,
                mensaje,
                titulo,
                JOptionPane.INFORMATION_MESSAGE);
    }

}
