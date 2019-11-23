public class Casa {
    Terreno terreno;
    protected double area; //area construida
    protected double preco;
    protected double areaquintal;
    public double areaterreno;
    public double precoarea;
    public Casa(Terreno terreno, double area,
    double preco) {
        this.terreno = terreno;
        this.area = area;
        this.preco = preco;
    }
    public double areaQuintal() {
       areaquintal = areaterreno - area;
        
       return areaquintal; 
    }
    public double precoArea(){
        precoarea = preco/areaquintal;
        
        return precoarea;
    }
}

//RAFAEL DOMINGOS DA SILVA 13206287