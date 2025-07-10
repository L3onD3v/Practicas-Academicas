public class NumeroNatural{
    private int n;

    public NumeroNatural(int n) {
        this.n = n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void imprimirNumeros(){
        int x = 1;
        do{
            System.out.println(""+x);
            x++;

        }while(x<=n);
    }


}