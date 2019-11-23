import java.lang.Math;

class Ponto3D extends Ponto{
	public double x=0, y=0, z=0;
	public Ponto3D(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public void atualizaCoordenada(double x, double y, double z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}
	public double retornaX() {
	    return this.x;
	}
	public double retornaY() {
	    return this.y;
	}
	public double retornaZ() {
	    return this.z;
	}
	public boolean ehPrimeiroQuadrante() {
	    boolean q1 = true;
	    q1 = x>0 && y >0 && z>0;
	    return q1;
	}
	
}