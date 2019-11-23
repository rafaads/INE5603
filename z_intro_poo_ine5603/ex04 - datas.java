public class Datas {
    protected byte dia;
    protected byte mes;
    protected byte ano;
   public void defineData (byte dia, byte mes, byte ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
   }
    
    public String mesPorExtenso() {
       String mensagem = null;
       byte mes = this.mes;
       switch (mes){
        case 1: mensagem = "Janeiro"; break;
        case 2: mensagem = "Fevereiro"; break;
        case 3: mensagem = "Março"; break;
        case 4: mensagem = "Abril"; break;
        case 5: mensagem = "Maio"; break;
        case 6: mensagem = "Junho"; break;
        case 7: mensagem = "Julho"; break;
        case 8: mensagem = "Agosto"; break;
        case 9: mensagem = "Setembro"; break;
        case 10: mensagem = "Outubro"; break;
        case 11: mensagem = "Novembro"; break;
        case 12: mensagem = "Dezembro"; break;
      }
       return (mensagem);
     }
}