public class Terreno {
    protected double frente;
    protected double fundo;
    protected double profundidade;
    public double areaterreno;
    public Terreno(double frente, double fundo,
    double profundidade) {
        this.frente = frente;
        this.fundo = fundo;
        this.profundidade = profundidade;
    }
    public double areaTerreno() {
        areaterreno = profundidade*(frente+fundo)/2;
        
        return areaterreno; 
    }
}

//RAFAEL DOMINGOS DA SILVA 13206287