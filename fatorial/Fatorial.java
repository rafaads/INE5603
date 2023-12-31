/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author rafael
 */
public class Fatorial extends javax.swing.JFrame {

    /**
     * Creates new form Fatorial
     */
    public Fatorial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fator = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        resultado = new javax.swing.JLabel();
        exp = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 1, 70)); // NOI18N
        jLabel1.setForeground(java.awt.Color.orange);
        jLabel1.setText("!");

        fator.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        fator.setModel(new javax.swing.SpinnerNumberModel(0, 0, 11, 1));
        fator.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                fatorStateChanged(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Noto Sans", 0, 50)); // NOI18N
        jLabel2.setForeground(java.awt.Color.black);
        jLabel2.setText("! = ");

        resultado.setFont(new java.awt.Font("Noto Sans", 0, 18)); // NOI18N
        resultado.setForeground(java.awt.Color.red);
        resultado.setText("1");

        exp.setFont(new java.awt.Font("Noto Sans", 0, 14)); // NOI18N
        exp.setForeground(javax.swing.UIManager.getDefaults().getColor("FormattedTextField.selectionBackground"));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(resultado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(exp)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(fator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(resultado))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(exp)
                .addGap(42, 42, 42))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fatorStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_fatorStateChanged
        // TODO add your handling code here:
        int n = Integer.parseInt(fator.getValue().toString()); //cada controle retorna um valor diferente
        
        String formula = "";
        int fat = 1; // 4! = 4 x 3 x 2 x 1 
        int cont = n;

        while ( cont >= 1 ){
           fat *= cont; //recebe ele mesmo * cont
           formula += (cont + " x ");
           cont--;
           
        
           
        }
        exp.setText(formula + "1");
        resultado.setText(Integer.toString(fat));
        
       /*
        1- Cria-se uma LABEL no PROJETO, preferencialmente abaixo do calculo. 
        Deixe a mesma sem valor e nomeio como preferir, aqui chamarei a mesma de lblFormula. 
        
        2- Deve se criar mais uma Classe String e inicializa-la, não inicializando-a o Algoritmo vai dar erro: 
        String formula = ""; 
        
        3- Acrescenta-se uma sintaxe DENTRO DO LAÇO WHILE informando a Classe string criada, 
        fazendo ela receber ela mesma + o contador + um sinal de * para ficar mais harmônico: 
        formula += (contador+" * "); 4o: Atribui a seguinte SINTAXE na label: 
        lblFormula.setText(formula + "1"); 
        A string "1" serve para o primeiro calculo não ficar 1 * nada
        */ 
        
        
    }//GEN-LAST:event_fatorStateChanged

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
            java.util.logging.Logger.getLogger(Fatorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fatorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fatorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fatorial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fatorial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel exp;
    private javax.swing.JSpinner fator;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel resultado;
    // End of variables declaration//GEN-END:variables
}
