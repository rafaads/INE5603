package agenda1;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class Main {

    private static final String DeletarContato = "DeletarContato";
    private static final String AdicionarContato = "AdicionarContato";
    private static final String acharContato = "acharContato";
    private static final String exportarCSV = "exportarCSV";

    public static void main(String[] args) {

        Agenda agenda = new Agenda();

        JFrame janela = new JFrame("Agenda");
        JPanel meuPainel = new JPanel();
        janela.setContentPane(meuPainel);

        ActionListener listener = new Gestor(agenda);
        mk_Tela(meuPainel, listener);

        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(600, 400);
        janela.setVisible(true);

    }

    static void mk_Tela(JPanel q, ActionListener listener) {

        JButton x;
        
          x = new JButton("Deletar contato");
          q.add(x);
          x.addActionListener(listener);
          x.setActionCommand(DeletarContato);

          x = new JButton("Novo contato");
          q.add(x);
          x.addActionListener(listener);
          x.setActionCommand(AdicionarContato);

          x = new JButton("Atualizar contato");
          q.add(x);
          x.addActionListener(listener);
          x.setActionCommand(acharContato);
          
          x = new JButton("Exportar CSV");
          q.add(x);
          x.addActionListener(listener);
          x.setActionCommand(exportarCSV);

    }
}
