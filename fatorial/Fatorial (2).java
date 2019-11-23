
package classes;

public class Fatorial {
    
    private int num = 0;
    private int fat = 1;
    private String formula = ""; // é verde pq é atributo e nao variável simples
    
    public void setValor( int n ) {
        num = n; // n é um parâmetro local
        int f = 1;
        String s = "";
        
        for(int c = n; c > 1; c-- ) {
            f *= c;
            s += c + " x ";
            
        }
        s += " 1 = ";
        fat = f;
        formula = s;
    }
    
    public int getFatorial() {
        return fat;
    }
    
    public String getFormula() {
        return formula;   
    }
}
