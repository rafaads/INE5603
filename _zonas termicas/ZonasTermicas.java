public class ZonasTermicas
{
    public String classificacao(double latitude)
    {
        if (latitude >= -30 && latitude <= 30)
            return "tropical";
        else if ((latitude >= -60 && latitude < -30) || (latitude > 30 && latitude <= 60))
            return "temperado";
        else
            return "polar";
    }
}
