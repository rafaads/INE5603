public abstract class Ponto
{
 double x;
 double y;
 double z;
 
 public abstract boolean ehPrimeiroQuadrante();
}

/* O poliformismo foi utilizado quando o this foi atribuido nas variáveis 
 * 
 * Quando foi criado a variável de uma classe abstrada e instanciou-se a mesma 
 * a partir de uma classe específica. A variávelé de um tipo fixo, mas seu valor pode mudar toda vez que
 * a instancia.
 * Em outras palavras, pode assumir várias formas.
 * 
 *     class ControleDePessoas {
 *      private double totalDePessoas = 0;
 *
 *       public void registra(Local local) {
 *       this.totalDePessoas += local.getPessoas();
 *      }
 *
 *        public double getTotalDePessoas() {
 *                return this.totalDePessoas;
 *       }
 *      }
 * 
 * Já o polimorfismo pro outro programa é apresentado na variável P, pois ela tem o mesmo nome,
 * mas comportamentos diferentes, um para 2D e outro para 3D.
 * 
 * 
 * -> A sobreposição é utilizada tanto na superclasse quanto na subclasse, mas possui uma 
 *    implementação específica de um método que já está previsto.
 *
 *  ->A classe Ponto é abstrata porque ela não precisa instanciar o método principal ela só precisa que as outras classes herdem características 
 *    da superclasse.
 *
 *
 *
 *
 */