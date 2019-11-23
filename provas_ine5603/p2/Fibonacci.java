
public class Fibonacci{

        public int fibo(int n){
        int somatorio;
        if(n < 0){
             somatorio = -1;
        } else if(n == 0){
            return 0;
        } else if(n == 1){
            somatorio = 1;
        } else{
            int anterior = 1;
            int aux;
            somatorio = 1;
            for(int i = 2; i < n; i++){
                aux = somatorio + anterior;
                anterior = somatorio;
                somatorio = aux;
            }    
      }    
      return somatorio;
  }    
}

//RAFAEL DOMINGOS DA SILVA 13206287