import java.lang.Math;

class Ponto2D { 
       
    protected double xP, yP;
    public Ponto2D(){
     xP = 0;
     yP = 0;
}
public void atualizaCoordenada(double x, double y) {
    xP = x;
    yP = y;
    }
public double distanciaOrigem(){
    double d;
    d=Math.sqrt(xP*xP + yP*yP);
    return d;
    
  }
public double retornaValorX(){
    return xP;
}
public double retornaValorY(){
    return yP;
}
}