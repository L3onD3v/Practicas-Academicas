public class Bisiesto {
    private int annio;

    public Bisiesto() {
        this.annio = 2015;
    }

    public int getAnnio() {
        return annio;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }


    public boolean esBisiesto(){
            if(annio % 4 == 0){
                if((annio %100 !=0)|| (annio %400 == 0)){
                    return true;
                }
        }
        return false;
    }
}
