public class Neperiano
{
    public long fatorial(long k)
    {
        long f = 1;
        for ( ; k>0; k-- )
        {
            f = f * k;
        }
        return f;
    }
    
    public double neperiano()
    {
        double e = 0;
        double termo = 1;
        for (long k=0; termo > 1e-9; k++) 
        {
            termo = 1.0 / fatorial(k);
            e = e + termo;
        }
        return e;
    }

    public double neperianoMelhorado()
    {
        double e = 2;
        double termo = 1;
        long   fat = 2;
        int k = 2;
        while ( termo > 1e-9 ) 
        {
            termo = 1.0 / fat;
            e = e + termo;
            k++;
            fat = k * fat;
        }
        return e;
    }


}




