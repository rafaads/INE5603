public class VetorInteirosBinarios extends VetorInteiros{
    public VetorInteirosBinarios(int v[]){
        super (v);
        this.vet = v;
    }
    public int moda(){
    	int Zero = 0;
    	int Um = 0;
    	for (int i = 0; i < vet.length; i++) {
			if (vet[i] ==0) {
				Zero++;
			}
			else{
				Um++;
			}
		}
    	if(Zero > Um){
    		return 0;
    	} else if (Um > Zero){
			return 1;
		} else{
    		return -1;
        }
    }

}

//RAFAEL DOMINGOS DA SILVA 13206287