public class Rectangulo{
    private int base;
    private int altura;

    public Rectangulo(int base, int altura) {
        if(base > 0){
            this.base = base;
        }else{
            this.base = 1;//Valor predeterminado si la base no es positivo
        }
        if(altura > 0){
            this.altura = altura;
        }else{
            this.altura = 1;//Valor predeterminado si la altura no es positivo
        }

        
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }



    public void setBase(int base) {
        if(base>0){
            this.base = base;
        }else{
            System.out.println("Digite un valor positivo para la base");
        }
    }

    public void setAltura(int altura) {
        if(altura>0){
            this.altura = altura;
        }else{
            System.out.println("Digite un valor positivo para la altura");
        }
        
    }

    public int calcularArea(){
        return base * altura;
    }
    

    

    
}