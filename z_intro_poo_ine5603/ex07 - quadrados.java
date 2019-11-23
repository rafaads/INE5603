import java.awt.*;

public class Quadrados
{
    protected Retangulo r; //quadrado temporario para ir montando o desenho
    protected int lado = 10; //lado do quadrado (considerando 10x10 pixels)
        
    public void grade(int colunas, int linhas)
    {
        int i, j, m, n;
        for (i=0; i < colunas; i++)
        {
            for (j=0; j < linhas; j++)
            {
                m = 2*i;
                n = 2*j;
                r = new Retangulo(lado*m, lado*n + lado, lado*m + lado, lado*n);
            }
        }
    }

    public void escada(int degraus)
    {
        int i, j, m, n;
        for (i=0; i < degraus; i++)
        {
            for (j=0; j <= i; j++)
            {
                m = 2*i;
                n = 2*j;
                r = new Retangulo(lado*m, lado*n + lado, lado*m + lado, lado*n);
            }
        }
    }


    public void piramide(int altura){
        int i,j, m, n;
        double d;
                for(i=0; i<altura; i++){
            for(j=0; j < (1+((altura-1)*2))*2-1; j++){
                
                if((((altura-1)*2))>=j-(i*2) && (((altura-1)*2))<=j+(i*2)){
               if(j%2==0){
                     d = 2*altura*lado;
                     m = 2*i;
                     n = j;
                     r = new Retangulo(lado*n, d-(lado*m + lado), lado*n + lado, d-(lado*m));
            
               }else{
                 
                }
            }
        }
     }
  }
}