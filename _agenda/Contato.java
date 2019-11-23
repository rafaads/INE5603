package agenda1;

public class Contato {

    private String name;
    private String fone;

    public Contato(String name, String fone) {
        this.name = name;
        this.fone = fone;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;

    }

    public String getFone() {
        return fone;

    }

    public void setFone(String fone) {
        this.fone = fone;

    }
}
