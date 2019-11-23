public class VetorInteiros extends Vetor{

    int vet[];
 public VetorInteiros(int v[]){
     super(v.length);
     this.vet = v;
    
 }
 
 public double media(){
     double media = 0;
     double soma = 0;
     for (int i = 0; i < vet.length; i++) {
        soma+=vet[i];
     }
     media = soma/vet.length;
     return media;
 }
}

//RAFAEL DOMINGOS DA SILVA 13206287