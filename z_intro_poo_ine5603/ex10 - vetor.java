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
  public void exibe() {
   for (int i=0; i<v.length; i++) {
    System.out.print(v[i] + "\t");
   }
    System.out.println();
  }
}