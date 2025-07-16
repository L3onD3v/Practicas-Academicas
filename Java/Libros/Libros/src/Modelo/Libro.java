package Modelo;

public class Libro {
    private String titulo;
    private String autor;
    private int paginas;
    private double valor;
    private int cantidad;

    public void setDatos(String titulo, String autor, int paginas, double valor, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.valor = valor;
        this.cantidad = cantidad;
    }

    public double valorCompra() {
        return cantidad * valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getPaginas() {
        return paginas;
    }

}
