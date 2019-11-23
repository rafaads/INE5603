public class SubMatrizBinaria extends MatrizBinaria {
    protected int A; //A deve ser menor ou igual a N
    public SubMatrizBinaria(int N, int A) {
        super(N);
        this.A = A;
    }
    
    public int conta() { //contagem de uns apenas da matriz MxM inicial
        
        int conta = 0;
        for (int i=0; i < this.A; i++)
           for (int j=0; j < this.A-i; j++)
              if (super.mat[i][j] == 1)
                conta++;
        
        return conta; 
    }
}

//RAFAEL DOMINGOS DA SILVA 13206287