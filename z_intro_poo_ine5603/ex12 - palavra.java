class Palavra {
   protected String p;
    public Palavra(String palavra) {
    p = palavra;
  }
   public String trocaMinuMaiu() {
    String saida = "";
 
      for (int i = 0; i < p.length(); i++) {
		   	
    	if(p.charAt(i) >= 'a' && p.charAt(i) <= 'z'){
            saida += Character.toUpperCase(p.charAt(i));  	
    	
    	}else if (p.charAt(i) >= 'A' && p.charAt(i) <= 'Z') {
    		saida += Character.toLowerCase(p.charAt(i));
    		
            }else saida += p.charAt(i);

    
  }
  return saida;
 }
}
