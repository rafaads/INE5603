public class Circulo{
    protected double raio;
    public Circulo(){
    raio = 0.0;
    }
    public void recebaValorRaio(double vRaio){
    raio = vRaio;
}
       
       public double fornecaArea(){
        double area;
        area = raio*raio*Math.PI;
        return area;
       }
       public double retornaRaio(){
        return raio;
        }
}