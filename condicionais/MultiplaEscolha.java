/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multiplaescolha;
import java.util.Scanner;
/**
 *
 * @author rafael
 */
public class MultiplaEscolha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o número de pernas: ");
        int pernas = teclado.nextInt();
        String tipo;
        System.out.println("Isto é um: ");
        switch(pernas){
            
            case 1:
                tipo = "COTOCO";
            break;
            
            case 2:
                tipo = "BÍPEDE";
            break;
            
            case 4:
                tipo = "QUADRÚPEDE";
            break;
                
            case 8:
                tipo = "ARACNÍDEO";
            break;
                
            default:
                tipo = "ALIEN";
            break;
            
        }
        System.out.println(tipo);
        
        
    }
    
}
