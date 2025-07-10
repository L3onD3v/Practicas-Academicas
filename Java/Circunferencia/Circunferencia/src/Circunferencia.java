public class Circunferencia {
    private double radio;

    public Circunferencia(){
        this.radio = radio;
    }

    public Circunferencia(double radio){
        this.radio = radio;
    }

    public double getRadio(){
        return radio;
    }

    public void setRadio(double radio){
        this.radio = radio;
    }

    //Metodo que calcula y devuelve el diametro

    public double obtenerDiametro(){
        return 2*radio;
    }

    //Metodo que calcula y retorna la longitud de una circunferencia

    public double obtenerLongitud(){
        return 2*Math.PI*radio;
    }

    //Metodo que calcula y retorna el area de la circunferencia

    public double obtenerArea(){
        return Math.PI*Math.pow(radio, 2);
    }

}
