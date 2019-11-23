class Vetor {
  protected int v[];
  public void pa(int a1, int r, int n) {
       v = new int[n];
       v[0] = a1;
      for(int i=1;i<v.length;i++){
            v[i]= v[i-1]+r;
            a1=v[v.length-1-i];
            n=a1+(n-1)*r;
      }
  }
  
  public void quadrado() {
      for(int i = 0; i < v.length; i++){
          v[i] = v[i]*v[i];
      }    
  }
 
  public int[] quadradonovo() {
    int novo[] = new int[v.length];
     for(int i = 0; i<v.length; i++){
        novo[i] = v[i]*v[i];

  }
          return novo;
   }
  
  public void exibenovo(int[] vetorqualquer) {
    if (vetorqualquer == null)
    vetorqualquer = this.v;
    for (int i=0; i<vetorqualquer.length; i++)
    System.out.print(vetorqualquer[i] + "\t");
    
  }
}






