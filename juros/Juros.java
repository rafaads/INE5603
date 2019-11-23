public class Juros
{
    protected double a;
    protected double r;
    public Juros(double a, double r)
    {
        this.a = a;
        this.r = r;
    }

    public void show(int n)
    {
        double ganho = a * (1 + r);
        System.out.println("Meses \t\t Investimento acumulado");
        for (int i=1; i <= n; i++) 
        {
            System.out.print(i + "\t\t ");
            System.out.println(ganho);
            ganho = ganho * (1 + r);
        }
    }
}
