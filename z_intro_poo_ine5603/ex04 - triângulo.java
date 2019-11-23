import java.lang.Math;

 public class Ponto {
      private double x;
     private double y;
 public Ponto(double x, double y) {
      this.x = x;
      this.y = y;
 }
 public double obtemX() {
      return this.x;
     }
     public double obtemY() {
           return this.y;
     }
      public double distancia(Ponto Q) {
    double d = Math.sqrt(
    Math.pow(this.x - Q.obtemX(), 2) +
    Math.pow(this.y - Q.obtemY(), 2) );
    return d;
 }
}
 class Triangulo {
    private Ponto P1;
    private Ponto P2;
    private Ponto P3;
    
        public Triangulo(double x1, double y1, double x2,
        double y2, double x3, double y3) {
        P1 = new Ponto(x1, y1);
        P2 = new Ponto(x2, y2);
        P3 = new Ponto(x3, y3);
 
        }
          public double ladoA(){
              return P1.distancia(P2);
        }
        public double ladoB() {
            return P1.distancia(P3);
        }
        public double ladoC() {
            return P2.distancia(P3);           
                   }
    
        public String tipoTrianguloLados() {
      if((ladoA()< (ladoB() + ladoC())) && (ladoB() < (ladoA() + ladoC())) && (ladoC() < (ladoA() + ladoB()))){
            if((ladoA() == ladoB()) && (ladoB() == ladoC())){
          return("O triângulo é equilátero");  
      }
      else{
                if((ladoA() == ladoB()) || (ladoA() == ladoC()) || (ladoC() == ladoB())){
          return("O triângulo é isósceles");  
        }
        else{
         return("O triângulo é escaleno");
        }
      }
    }
        return "";
    }
}