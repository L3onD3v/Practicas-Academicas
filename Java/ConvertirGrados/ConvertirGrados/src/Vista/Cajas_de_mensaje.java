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

    public double solicitarCelsius(String mensaje) {
        return Double.parseDouble(JOptionPane.showInputDialog(null, mensaje, titulo, 1));
    }

    public void mostrarFarent(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, 1);

    }

}
