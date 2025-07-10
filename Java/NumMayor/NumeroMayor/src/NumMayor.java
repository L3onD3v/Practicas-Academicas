public class NumMayor {
    private int a;
    private int b;

    public NumMayor(){
        this.a = 0;
        this.b = 0;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public String esMayor(){
        String respuesta = (a > b)?"mayor":"menor";
        return respuesta;
    }



}
