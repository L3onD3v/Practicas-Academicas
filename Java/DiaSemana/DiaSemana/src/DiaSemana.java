public class DiaSemana {
    
        public static void imprimirDiaSemana(){
            String semana[]={"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
            for(int i=0; i < semana.length;i++){
                System.out.println((i+1)+". "+semana[i]);
            }
        }
        public static void main(String[] args) throws Exception {
            imprimirDiaSemana();
    }
}
