public class Q3 {
    public static int[][] triangulos(int N) {
        int mat[][] = new int[N][N];
        
        for(int i=0;i<N;i++){
            for(int j=0; j<N; j++)
            mat[i][j]=1;
        }
        for(int i =0;i<N;i++){
            for(int j=0;j<N-i;j++)
            mat[i][j]=0;
        }    
        return mat;
    }
    public static void main(String[] args) {
        int m[][] = triangulos(5);
    }
}

//RAFAEL DOMINGOS DA SILVA 13206287