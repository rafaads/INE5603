package agenda1.telas;

import agenda1.Agenda;
import agenda1.Contato;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaDelete extends JFrame implements ActionListener {
    private Agenda agenda;
    private JButton botao1;
    private JButton botao2;
    
    private JLabel nomeLabel;
    private JTextField nomeField;
    
    private JLabel foneLabel;
    private JTextField foneField;
    
    private GridBagConstraints c = new GridBagConstraints();

    public TelaDelete(Agenda agenda) {
        super ("Deletar");
        this.agenda = agenda;
        setLayout(new GridBagLayout());
        c.insets = new Insets(10, 0, 10, 0);
        nomeLabel = new JLabel("Nome:");
        c.gridx = 0;
        c.gridy = 0;
        add(nomeLabel, c);
        
        nomeField = new JTextField();
        nomeField.setPreferredSize(new Dimension(150, 20));
        
        c.gridx = 1;
        c.gridy = 0;
        add(nomeField, c);
       
        foneLabel = new JLabel("Fone:");
        c.gridx = 0;
        c.gridy = 1;
        add(foneLabel, c);
        
        foneField = new JTextField();
        foneField.setPreferredSize(new Dimension(150, 20));
        
        c.gridx = 1;
        c.gridy = 1;
        add(foneField, c);
        
        botao1 = new JButton("Deletar");
        c.gridx = 0;
        c.gridy = 2;
        add(botao1, c);
        
        botao1.addActionListener(this);
        
        
        setSize(300, 500);
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == botao1) {
            Contato contato = new Contato(nomeField.getText(), foneField.getText());
            agenda.DeletarContato(contato);
            for (Contato ct : agenda.getLista()) {
                System.out.print("Nome:" + ct.getName() + " / Fone:" + ct.getFone());
            }
            nomeField.setText("");
            foneField.setText("");
        }
    }

     

}
