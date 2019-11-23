package agenda1.telas;

import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Tela2 extends JFrame implements ActionListener  {
    private JButton oi;
    public Tela2(){
        super ("oii");
        setLayout(new GridBagLayout());
        oi = new JButton ("lol");
        add(oi);
        setSize(200,300);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    }

}
