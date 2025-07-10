public class Calculadora {
    private double x;
    private double y;



    public Calculadora(){
        this.x = 0;
        this.y = 0;
    }


    public Calculadora(double x, double y){
        this.x = x;
        this.y = y;
    }


    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    public double obtenerSuma(){
        return x+y;
    }

    public double obtenerRestas(){
        return x-y;
    }

    public double obtenerProducto(){
        return x*y;
    }

    public double obtenerDivision(){
        return x/y;
    }
}
