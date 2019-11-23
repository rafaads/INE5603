public class Individuo {
    protected int matricula;
    protected double conceito;
   
   public Individuo (int matricula, double conceito) {
        this.matricula = matricula;
        this.conceito = conceito;
        
   }
   public double obtemConceito(){
    return this.conceito;
   }
}