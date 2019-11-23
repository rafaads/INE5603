public class Q1 {
        
    public static String maiorPalavra(String[] V) {
        String saida;
        int maior = 0;
        int vetor = V[0].length();
            for (int i=0; i<V.length; i++){
                
                if(V[i].length() > vetor){
                    maior=i;
                    vetor = V[maior].length();
            }
            
        }
        return V[maior];
    }
    
     public static void main(String[] args) {
        String[] palavras = {"Cubo", "Esfera", "Cone", "Paralelepipedo", "Cilindro"};
        String resultado = maiorPalavra(palavras);
        System.out.println(resultado);
    }
}


//RAFAEL DOMINGOS DA SILVA 13206287