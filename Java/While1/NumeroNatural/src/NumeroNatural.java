public class NumeroNatural {
    private int n;

    public NumeroNatural(int n) {
        this.n = n;
    }

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }


    public void ImprimirNumerosNaturales(){
        int x = 1;

        while(x<=n){
            System.out.println(""+x);
            x++;
        }
    }
    
    
}