public class Persona {
    private int edad;

    public Persona(){
        this.edad=0;
    }

    public Persona(int edad){
        if (edad >0){
            this.edad = edad;
        }else{
            this.edad=0;
        }
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad >= 0) {
            this.edad = edad;
    }
    }

    public String evaluarEdad(){
        String resultado = "";
        //Este es un condicional que compara numeros
        if(edad>=18){
            resultado = "Es una persona mayor de edad";
        }else{
            resultado = "No es mayor de edad";
        }
        return resultado;
    }

}
