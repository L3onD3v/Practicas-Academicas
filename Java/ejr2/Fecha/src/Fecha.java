public class Fecha{
    private int dia;
    private int mes;
    private int año;


    public Fecha(){
        this.dia = 30;
        this.mes = 7;
        this.año = 2015;
    }

    public Fecha(int dia, int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    @Override
    public String toString() {
        return ""+dia + "/" + mes + "/" + año;
    }



}