package agenda1;

import agenda1.telas.TelaAtualizar;
import agenda1.telas.TelaContato;
import agenda1.telas.TelaDelete;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

class Gestor implements ActionListener {

    private Agenda agenda;
    final private String path = "agenda.csv"; 

    public Gestor(Agenda agenda) {
        this.agenda = agenda;
    }

    public void actionPerformed(ActionEvent c) {
        String cmd = c.getActionCommand();
        switch (cmd) {
            case "AdicionarContato":
                AdicionarContato();
                break;
            case "acharContato":
                acharContato();
                break;
            case "DeletarContato":
                DeletarContato();
                break;
            case "AtualizarNumero":
                AtualizarNome();
                break;
            case "AtualizarNome":
                AtualizarNome();
                break;
            case "exportarCSV":
        {
            try {
                exportarCSV();
            } catch (IOException ex) {
                System.out.println("Erro ao exportar!");
            }
        }
                break;
            default:
                break;
        }
    }

    private void AtualizarNome() {

    }

    private void acharContato() {
        TelaAtualizar telaAtualizar = new TelaAtualizar(agenda);
        telaAtualizar.setVisible(true);
    }

    private void AdicionarContato() {
        TelaContato telaContato = new TelaContato(agenda);
        telaContato.setVisible(true);

    }

    private void DeletarContato() {
        TelaDelete telaDelete = new TelaDelete(agenda);
        telaDelete.setVisible(true);

    }
    
    private void exportarCSV() throws IOException {
        String formatoCSV = "";
        for(Contato it : agenda.getLista()){
            formatoCSV+=it.getName()+","+it.getFone()+"\n";
        }
        BufferedWriter buffWrite = new BufferedWriter(new FileWriter(path));
		buffWrite.append(formatoCSV);
		buffWrite.close();
    }
}
