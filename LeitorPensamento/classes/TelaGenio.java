/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Font;

/**
 *
 * @author rafael
 */
public class TelaGenio extends javax.swing.JFrame {

    /**
     * Creates new form TelaGenio
     */
    public TelaGenio() { //contrutor
        initComponents();
        frase.setText("<html>Tente adivinhar o valor entre 1 e 5 que estou pensando</html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        frase = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        valor = new javax.swing.JSpinner();
        palpite = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/genio.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, -1, -1));

        frase.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        frase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        frase.setText("Frase");
        frase.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(frase, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 180, 70));

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("/home/rafael/Dropbox/Curso Online/Java/Conteúdo Aulas/aula08exercicios/LeitorPensamento/src/imagens/balao.png")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 200, 170));

        jLabel3.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        jLabel3.setText("Valor");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        valor.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        valor.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        getContentPane().add(valor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 60, 40));

        palpite.setFont(new java.awt.Font("Noto Sans", 1, 14)); // NOI18N
        palpite.setText("Palpite");
        palpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                palpiteActionPerformed(evt);
            }
        });
        getContentPane().add(palpite, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 100, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void palpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_palpiteActionPerformed
        // TODO add your handling code here:
        double n = 1 + Math.random() * (6 - 1);
        int v = (int) n;
        
        int num = Integer.parseInt(valor.getValue().toString()); //pega numero digitado
        
        String f1 = "<html>Acertou!</html>";
        String f2 = "<html>Errrou!!! era " + v +"<html>";
        
        String res = (v == num) ? f1:f2;
        
        frase.setFont(new Font("Arial Black", Font.BOLD, 16));
        
        frase.setText(res);
        
    }//GEN-LAST:event_palpiteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaGenio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaGenio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel frase;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton palpite;
    private javax.swing.JSpinner valor;
    // End of variables declaration//GEN-END:variables
}
