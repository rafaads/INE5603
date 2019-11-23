public class Ex14{
    int matriz[][];
    public Ex14(int m[][]){
        matriz = m;
   }
    public Ponto2D linha_coluna_maior() {
    int x = 0;
    int y = 0;

    int maisAlto = 0;
    for (int y1 = 0; y1 < matriz.length; y1++){
        for (int x1 = 0; x1< matriz[y1].length; x1++){
              
            if (matriz[y1][x1] > maisAlto) {
            maisAlto = matriz[y1][x1];
            x = y1;
            y = x1;
           }
       }
    }        
    Ponto2D P;
    P = new Ponto2D(x, y);
    return P;

   }
}

class Ponto2D {
    protected double x, y;
    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
   }
   public void atualizaCoordenada(double x, double y) {
       this.x = x;
       this.y = y;
    }

    public double retornaX() {
        return this.x;
    }

    public double retornaY() {
        return this.y;
    }
}
