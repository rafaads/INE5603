/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicaosimples;

import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class CondicaoSimples {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        System.out.print("Nota P1: ");
        float n1 = teclado.nextFloat();
        System.out.print("Nota P2: ");
        float n2 = teclado.nextFloat();
        double n = ((n1 + n2) / 2);
        System.out.println("A média é: " + n);
        
        if (n >= 9){
            System.out.println("Parabéns!");
        } 
    }
    
}
