import java.util.Scanner;
public class Estatistica 
{
    public void contagem(int N)
    {
        int p, n, z;
        p = 0;
        n = 0;
        z = 0;
        Scanner entrada = new Scanner(System.in);
        for (int i = 1; i <= N; i++) 
        {
            System.out.print("Digite o proximo valor: ");
            int valor = entrada.nextInt();
            if (valor > 0)
            {
                p = p + 1;
            }
            else if (valor < 0)
            {
                n = n + 1;
            }
            else
            {
                z = z + 1;
            }
        }
        System.out.println(p);
        System.out.println(n);
        System.out.println(z);
    }
}
