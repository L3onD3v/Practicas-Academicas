public class Compra {
    private double valorCompra;

    public Compra() {
        this.valorCompra = 0;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    
    public double obtenerDescuento(){
        double descuento = 0.0;

        final double VALOR_COMPRA_DESCUENTO = 1000000;
        final double VALOR_DESCUENTO = 0.05;

        if(valorCompra >= VALOR_COMPRA_DESCUENTO){
            descuento = valorCompra * VALOR_DESCUENTO;
        }
        return descuento;
    }
    
}
