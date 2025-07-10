public class NumeroDiasMes{
    private int aa;
    private int mm;

    public NumeroDiasMes(){
        this.aa = 2015;
        this.mm = 4;
    }

    public NumeroDiasMes (int aa, int mm){
        this.aa = aa;
        this.mm = mm;
    }

    public int getAa() {
        return aa;
    }

    public int getMm() {
        return mm;
    }

    public void setAa(int aa) {
        this.aa = aa;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int obtenerNumeroDias(){
        int numeroDias = 0;
        switch (mm) {
            case 1:case 3:case 5:case 7:case 10:case 12:
            case 8:
                numeroDias = 31;
                break;
            case 2:
                if(esBisiesto(aa)){
                    numeroDias = 29;
                }else{
                    numeroDias = 28;
                }
                break;
            case 4:case 6:case 9:case 11:
                numeroDias = 30;
                break;
            default:
            System.out.println("Mes no contemplado");
                break;
        }
        return numeroDias;
    }

    private boolean esBisiesto(int aa){
        boolean bisiesto = false;
        if((aa % 4 == 0) && (aa % 100 != 0) || (aa % 400 == 0)){
            bisiesto = true;
        }else{
            bisiesto = false;
        }return bisiesto;
     }
}