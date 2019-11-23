
package testefuncao02;

public class TesteFuncao02 {

    static int soma(int a, int b){ //se tirar o static da erro pq nao pode chamar um metodo nao estatico em um estatico
        int s = a + b;
        return s;
    }
            
    
    
    public static void main(String[] args) {
        System.out.println("Começou!");   
        int sm = soma( 4, 6 );
        
        System.out.println("A soma vale " + sm);
        
    }
    
}
