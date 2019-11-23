 public class Professor extends Individuo{
       public String titulacao;
       
       public Professor (int matricula, double conceito, String titulacao){
           
           super(matricula, conceito);
           this.titulacao = titulacao;
        }
       
    

       public double obtemConceito(){
        
            return conceito/2;
       }
}