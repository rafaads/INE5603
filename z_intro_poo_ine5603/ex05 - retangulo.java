
public class Retangulo {
  protected double x1, y1; //ponto esquerdo-superior
  protected double x2, y2; //ponto direito-inferior
  
  public Retangulo(double x1, double y1, double x2, double y2){
   this.x1 = x1;
   this.y1 = y1;
   this.x2 = x2;
   this.y2 = y2;
  }

   public Retangulo calculaInterseccao(Retangulo R) {
    double x;
    double y;
    double rx1=0;
    double rx2=0;
    double ry1=0;
    double ry2=0;
    
    double Sx1, Sx2, Sy1, Sy2;

    Sx1 = Math.max (x1,rx1);
    Sx2 = Math.min (x2,rx2);
    Sy1 = Math.min (y1,ry1);
    Sy2 = Math.max (y2,ry2);

       if ((rx1 > x2) || (rx2 < x1) || (ry1 < y2) || (ry2 > y1)){
         System.out.println("Não há intersecção!");
        } else {
         Retangulo S = new Retangulo(Sx1, Sy1, Sx2, Sy2);      
         return S;
    }
    return R;
  }
}