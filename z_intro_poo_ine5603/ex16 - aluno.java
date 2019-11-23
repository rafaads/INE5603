 public class Aluno extends Individuo
    {
       public int ano;
       public String curso;
       
         public Aluno (int matricula, double conceito, int ano, String curso)
         {
             super(matricula, conceito);
             this.curso = curso;
             this.ano = ano;
            }
             public double obtemConceito(){
             return conceito*10; 
            }
         }
        
   
