import java.lang.Math;
public class MatrizBinaria {
    protected int N;
    protected int mat[][];
    public MatrizBinaria(int N) {
        this.N = N;
        this.mat = new int[N][N];
        for (int i=0; i < N; i++)
        for (int j=0; j < N; j++)
        this.mat[i][j] = (int) (Math.random() + 0.5);
    }
    public int conta() { //contagem de zeros da matriz NxN completa
       
        int quant = 0;
        for (int i=0; i < this.N; i++)
           for (int j=0; j < this.N; j++)
              if (this.mat[i][j] == 0)
                quant++;
                return quant;
    }
}

//RAFAEL DOMINGOS DA SILVA 13206287