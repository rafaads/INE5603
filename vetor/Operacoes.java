
package testefuncao03;

public class Operacoes {
    
    public static String contador(int i, int f) { //static pode fazer chamada sem instanciar objetos
        String s = "";
        
        for( int c = i; c <= f; c++ ) {
            s += c + " ";
        }
        return s;
    }
    
}
