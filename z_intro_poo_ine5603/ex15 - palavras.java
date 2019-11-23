public class Q1 {
            public static void mostraPalavrasComCaracteres(String[] V, char C, int Q) {
                for (int i = 0; i<V.length; i++){
                    int cont = 0;
                    for(int t =0; t <V[i].length(); t ++){
        if (V[i].charAt (t) == C){
            cont ++;
            if (cont == Q){
                System.out.println(V[i]);
                break;
            }
        }
       }
    }
  }
    public static void main(String[] args) {
        String[] palavras = {"Queijo", "Tomate", "Azeitonas Pretas", "Peru", "Massa fina"};
        mostraPalavrasComCaracteres(palavras, 'a', 2);
    }
}