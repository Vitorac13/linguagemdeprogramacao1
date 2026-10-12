/*27. Quantidade de caminhos em uma escada ★★★★
Objetivo: Modelar possibilidades como ramificações recursivas.
Pré-requisitos: Recursividade múltipla e casos base.
Dica gradual: Para chegar ao topo, o último movimento pode ter sido de 1 ou 2 degraus. Quantos
caminhos existem em cada situação?
Enunciado: Implemente “int quantidadeCaminhos(int n)”. */

public class Ex27_QuantidadeCaminhos {
    public static void main(String[] args) {
        System.out.println(quantidadeCaminhos(2));
    }

    static int quantidadeCaminhos(int n){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        return quantidadeCaminhos(n - 1) + quantidadeCaminhos(n - 2);
    }
}
