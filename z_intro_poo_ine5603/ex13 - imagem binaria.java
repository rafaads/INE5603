public class ImagemBinaria
{
    int img[][] =   { {1, 1, 1, 1, 1, 1, 1, 1},
                      {0, 1, 0, 1, 1, 1, 0, 0},
                      {0, 0, 0, 0, 0, 0, 0, 0},
                      {1, 1, 1, 1, 1, 1, 1, 1},
                      {1, 1, 0, 0, 1, 1, 1, 0} };

    public ImagemBinaria(int IMG[][])
    {
        img = IMG;
    }
    
    public int contaPretos() {
        int i, j, conta=0;
        for (i=0; i < img.length; i++) {
            for (j=0; j < img[i].length; j++) {
                if (img[i][j] == 0)
                    conta++;
            }
        }
        return conta;
    }
    
    public int contaBrancos(){
       int i, j, conta=0;
       for (i=0; i<img.length; i++){
           for (j=0; j < img[i].length; j++){
               if (img[i][j] == 1)
                  conta++;
                }
            }
       return conta;
    }
    
    public int contaLinhasPretas(){
        int i, j, conta=0;
        boolean T;
        for (i=0; i < img.length; i++) {
            T = true;
            for (j=0; j < img[i].length; j++) 
               if (img[i][j] != 0) {
                   T = false;
                   break;
                }
               if (T)
                conta++;
        }
        return conta;
    }
    
    public int contaLinhasBrancas() {
        int i, j, conta=0;
        boolean T;
       for (i=0; i < img.length; i++){
           T = true;
           for (j=0; j < img[i].length; j++)
               if (img[i][j] !=1) {
                   T = false;
                   break;
                }
           if (T)
              conta++;
            }
       return conta;
    }

   
}