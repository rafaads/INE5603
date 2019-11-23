package agenda1;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class Agenda implements IAgenda {

    private ArrayList<Contato> lista;

    public Agenda() {
        this.lista = new ArrayList<Contato>();
    }

    @Override
    public void AdicionarContato(Contato c) throws RuntimeException {

        if (!acharContato(c)) {
            this.lista.add(c);
        } else {
            try {
                throw new Exception("contato já existente na lista");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void DeletarContato(Contato c) throws RuntimeException {

        if (acharContato(c)) {
            for (Contato contato : this.getLista()) {
                if (contato.getName().equals(c.getName()) &&
                    contato.getFone().equals(c.getFone())) {
                    c = contato;

                }
            }
            this.lista.remove(c);
        } else {
            try {
                throw new Exception("contato não encontrado");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void atualizarContato(Contato c, Contato novo) {

        if (acharContato(c)) {
            this.DeletarContato(c);
            this.AdicionarContato(novo);

        } else {

            System.out.println("O contato não existe");

        }
    }

      public void AtualizaNome(Contato c, String name) {

        if (acharContato(c)) {
            c.setName(name);

        } else {
            System.out.println("O contato não existe");

        }

    }

    @Override
    public boolean acharContato(Contato c) throws RuntimeException {
      
        for (Contato contato : this.getLista()) {
            if (contato.getName().equals(c.getName()) &&
                contato.getFone().equals(c.getFone())) {
             return true;

            }
        }
        return false;

    }

    public ArrayList<Contato> getLista() {
        return lista;

    }

    public void setLista(ArrayList<Contato> lista) {
        this.lista = lista;

    }
}
