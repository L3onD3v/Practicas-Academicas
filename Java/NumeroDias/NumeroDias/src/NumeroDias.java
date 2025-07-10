/*Clase que evalua el numero de dias del mes
 * y evalua también si el año es bisiesto
 */

public class NumeroDias {
    private int aa;
    private int mm;

    public NumeroDias(){
        this.aa = 2015;
        this.mm = 4;
    }


    public NumeroDias(int aa, int mm){
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

    public int obtenerNumeroDias() {
        int numeroDias = 0;
        
        if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 || mm == 12) {
            numeroDias = 31;
        } else if (mm == 2) {
            if (esBisiesto()) {
                numeroDias = 29;
            } else {
                numeroDias = 28;
            }
        } else {
            numeroDias = 30;
        }
        
        return numeroDias;
    }

    /* Método que evalua si un año es bisiesto
     * retrun True si el año es bisiesto o false al contrario
     */

     private boolean esBisiesto(){
        boolean bisiesto = false;
        if((aa % 4 == 0) && (aa % 100 != 0) || (aa % 400 == 0)){
            bisiesto = true;
        }else{
            bisiesto = false;
        }return bisiesto;
     }
    
}

    





