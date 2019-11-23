public class Asteriscos
{

    public void grade(int colunas, int linhas)
    {
        int i, j;
        for (i=0; i < linhas; i++)
        {
            for (j=0; j < colunas; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void escada(int degraus)
    {
        int i, j;
        for (i=0; i < degraus; i++)
        {
            for (j=0; j < degraus - i - 1; j++)
            {
                System.out.print(" ");
            }
            for (j=0; j <= i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public void piramide(int altura){
        int i,j;
		for(i=0; i<altura; i++){
			for(j=0; j< (1+((altura-1)*2))*2-1; j++){
				
				if((((altura-1)*2))>=j-(i*2) && (((altura-1)*2))<=j+(i*2)){
					if(j%2==0){
						System.out.print("*");
					}else{
						System.out.print(" ");
					}
				}else{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
}
    


