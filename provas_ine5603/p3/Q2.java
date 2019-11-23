public class Q2 {
    public static int[] contagem(int[] vet) {
        int[] conta = new int[2];
        conta[0] = 0;
        conta[1] = 0;
            for(int i=0; i<vet.length;i++){
                if (vet[i]%2 == 0){
                    conta[0]++;
                } else {conta [1]++;
                 }
                }   
        return conta;
    }
    public static void main(String[] args) {
        int[] v = {3, 2, 10, 5, 0, 11, 0};
        int[] c = contagem(v);
    }
}


//RAFAEL DOMINGOS DA SILVA 13206287