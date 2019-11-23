   class Retangulo {
       protected double x1, y1; //coordenada esquerda-superior
       protected double x2, y2; //coordenada direita-inferior
       
       public Retangulo(double x1, double y1, double x2, double y2) {
    this.x1 = x1;
    this.y1 = y1;
    this.x2 = x2;
    this.y2 = y2;  
   }
}

class Oito {
    protected double d; //espessura
    protected Retangulo r1, r2, r3, r4, r5, r6, r7;
    
    public Oito (double d) {
    

    r1 = new Retangulo (d, 5*d, 4*d, 4*d); //central
    r2 = new Retangulo (d, 9*d, 4*d, 8*d); //superior
    r3 = new Retangulo (d, d, 4*d, 0); //inferior
    r4 = new Retangulo (0, 8*d, d, 5*d); //superior esquerda
    r5 = new Retangulo (0, 4*d, d, d); //inferior esquerda
    r6 = new Retangulo (4*d, 8*d, 5*d, 5*d); //superior direita
    r7 = new Retangulo (4*d, 4*d, 5*d, d); //inferior direita
    
   }
}


//RAFAEL DOMINGOS DA SILVA 13206287