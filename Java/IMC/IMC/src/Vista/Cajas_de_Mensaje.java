package Vista;

import javax.swing.JOptionPane;

//Calcular el indice de masa muscular
//peso/estatura*estatura
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
        return Double.parseDouble(JOptionPane.showInputDialog(null, mensaje, titulo, 1));
    }

    public void mostrarResultado(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, 1);
        ;

    }

}
