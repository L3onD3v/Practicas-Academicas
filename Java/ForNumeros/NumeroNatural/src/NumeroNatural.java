public class NumeroNatural{
        private  int n;

        public NumeroNatural(int n) {
            this.n = n;
        }

        public void setN(int n) {
            this.n = n;
        }

        public int getN() {
            return n;
        }

        
        public void imprimirNumerosNaturales(){
                for(int x =1;x<=n;x++){
                    System.out.println(""+x);
                }

        }

}