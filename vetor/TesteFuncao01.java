
package testefuncao01;

public class TesteFuncao01 {

    static void soma(int a, int b){
       int s = a + b;
       System.out.println("A soma é " + s);
   } 
    
    public static void main(String[] args) { //void é um procedimento e main método (rotina) que nao retorna valor
        System.out.println("Começou! ");
        soma ( 6, 2 ); //chamada procedimento
        
    }
}
