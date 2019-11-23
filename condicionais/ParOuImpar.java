/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parouimpar;

import java.util.Scanner;

/**
 *
 * @author rafael
 */
public class ParOuImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner (System.in);
        System.out.print("Digite um número: ");
        int numero = teclado.nextInt();
        
        if (numero % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }
        
        
    }
    
}
