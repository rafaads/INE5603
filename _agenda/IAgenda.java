package agenda1;

public interface IAgenda {

    public boolean acharContato(Contato c);

    public void AdicionarContato(Contato c);

    public void DeletarContato(Contato c);

    public void atualizarContato(Contato c, Contato novo);
}
