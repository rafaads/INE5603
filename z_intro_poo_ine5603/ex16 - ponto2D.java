import java.lang.Math;

class Ponto2D extends Ponto{
	public double x=0, y=0;
	public Ponto2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public void atualizaCoordenada(double x, double y) {  //x e y são variáveis locais
		this.x = x; //atributo da classe
		this.y = y;
	}
	public double retornaX() {
	    return this.x;
	}
	public double retornaY() {
	    return this.y;
	}
	public boolean ehPrimeiroQuadrante() {
	    boolean q1 = true;
	    q1 = x>=0 && y >=0 ;
	    return q1;
	}
	
}