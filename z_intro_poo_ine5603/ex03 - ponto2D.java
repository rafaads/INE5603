import java.lang.Math;

class Ponto2D {
	protected double x, y;
	public Ponto2D(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public void atualizaCoordenada(double x, double y) {
		this.x = x;
		this.y = y;
	}
	public double retornaX() {
	    return this.x;
	}
	public double retornaY() {
	    return this.y;
	}
	public double distanciaOrigem() {
		double d;
		d = Math.sqrt( this.x * this.x + this.y * this.y );
		return d;
	}
	public boolean ehPrimeiroQuadrante() {
	    boolean q1 = true;
	    q1 = x>=0 && y >=0 ;
	    return q1;
	}
	public double distanciaPonto(Ponto2D p) {
	    double d;
	    double xp = p.retornaX ();
	    double yp = p.retornaY ();
	    d = Math.sqrt ((xp -this.x)*(xp -this.x) + (yp - this.y)*(yp - this.y));
	    return d;
	}
}