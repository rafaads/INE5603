/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import javax.swing.JOptionPane;
/**
 *
 * @author RAFAEL
 */

public class Raiz {
   public double sqrt() {
       
      int a;
      a = Integer.parseInt(JOptionPane.showInputDialog("Informe um número: (MAIORES QUE 0)"));
      double x0 = a/2;
      double x1;
      
      for ( ; ;  ) {
         x1 = 0.5*(x0 + (a/x0));
         System.out.println("Pelo método de Newton: " + x1);
         if (Math.abs(x1 - x0) < 1.0){
            break;
        }  
         x0 = x1;
      }
      System.out.println("O Valor tirado como prova real é: " + x1*x1);
      System.out.println("O Valor pela calculadora é: " + Math.sqrt(a));
      return x1;
   }
}