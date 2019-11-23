package agenda1.telas;

import agenda1.Agenda;
import agenda1.Contato;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.HeadlessException;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class TelaAtualizar extends JFrame implements ActionListener {

    private Agenda agenda;

    private JButton botao1;
    private JButton botao2;
    
    private JLabel nomeLabel;
    private JTextField nomeField;
    
    private JLabel foneLabel;
    private JTextField foneField;
    
    private JLabel nomeNovoLabel;
    private JTextField nomeNovoField;
    
    private JLabel foneNovoLabel;
    private JTextField foneNovoField;
    
    private GridBagConstraints c = new GridBagConstraints();

    public TelaAtualizar(Agenda agenda) {
        super("Atualizar");
        this.agenda = agenda;
        
        setLayout(new GridBagLayout());
        c.insets = new Insets(10, 0, 10, 0);
        nomeLabel = new JLabel("Nome atual:");
        c.gridx = 0;
        c.gridy = 0;
        add(nomeLabel, c);
        
        nomeField = new JTextField();
        nomeField.setPreferredSize(new Dimension(150, 20));
        
        c.gridx = 1;
        c.gridy = 0;
        add(nomeField, c);
       
        foneLabel = new JLabel("Fone atual:");
        c.gridx = 0;
        c.gridy = 1;
        add(foneLabel, c);
        
        foneField = new JTextField();
        foneField.setPreferredSize(new Dimension(150, 20));
        
        c.gridx = 1;
        c.gridy = 1;
        add(foneField, c);
        
        nomeNovoLabel = new JLabel("Nome novo:");
        c.gridx = 0;
        c.gridy = 2;
        add(nomeNovoLabel, c);
        
        nomeNovoField = new JTextField();
        nomeNovoField.setPreferredSize(new Dimension(150, 20));
        
        c.gridx = 1;
        c.gridy = 2;
        add(nomeNovoField, c);
       
        foneNovoLabel = new JLabel("Fone novo:");
        c.gridx = 0;
        c.gridy = 3;
        add(foneNovoLabel, c);
        
        foneNovoField = new JTextField();
        foneNovoField.setPreferredSize(new Dimension(150, 20));
        
        c.gridx = 1;
        c.gridy = 3;
        add(foneNovoField, c);
        
        botao1 = new JButton("Atualizar");
        c.gridx = 0;
        c.gridy = 5;
        add(botao1, c);
        
        botao1.addActionListener(this);
        
        setSize(300, 500);
        
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == botao1) {
            Contato contatoAtual = new Contato(nomeField.getText(), foneField.getText());
            Contato contatoNovo = new Contato(nomeNovoField.getText(), foneNovoField.getText());
            agenda.atualizarContato(contatoAtual, contatoNovo);
            for (Contato ct : agenda.getLista()) {
                System.out.print(" Nome:" + ct.getName() + " / Fone:" + ct.getFone());
            }
            nomeField.setText("");
            foneField.setText("");
            nomeNovoField.setText("");
            foneNovoField.setText("");
        }
    }
    
}
