import java.awt.*;

public class Cortina
{
    /*
     Janela Grafica 300x300
     
           ^
         y |
           |
       300 |............
           |     .     .
           |     .     .
       150 |............
           |     .     .
           |     .     .
         0 +----------------->
           0    150   300  x
     */
    
    protected Retangulo r; //retangulo temporario para ir montando a cortina
    protected int largura = 10; //largura do retangulo para cada passo (10 pixels)
        
    public void fechar(){
        
        for (int i=0; i < 150; i=i+largura)
        {
            r = new Retangulo(i, 300, i+largura, 0, "green", 50);
            r = new Retangulo(300-i-largura, 300, 300-i, 0, "yellow", 50);
        }
    }

    public void abrir(){
        
         for (int i=0; i < 301; i=i+largura){
            r = new Retangulo(150-i-largura, 300, 160-i, 0, "white", 50);           
            r = new Retangulo(150+i+largura, 300, 150+i, 0, "white", 50);
        }
    }
    }