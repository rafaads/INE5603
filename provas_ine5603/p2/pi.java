public class pi{
    
    public double bla(int n){
        double donominador = 1;
        boolean soma = true;
        double somatorio = 0;
        for(int i = 0; i < n; i++){
              if(soma){
                  somatorio += 1/donominador;
                }else{
                    somatorio -= 1/donominador;
                }     
              donominador += 2;
              soma = !soma;
         }
        return 4*somatorio;
       
    }
}


//RAFAEL DOMINGOS DA SILVA 13206287