/*9. Quantidade de algarismos ★★
Objetivo: Usar divisão para reduzir progressivamente o problema.
Pré-requisitos: Divisão inteira e retorno.
Dica gradual: Dividir por 10 elimina um algarismo de um inteiro positivo.
Enunciado: Implemente “int quantidadeAlgarismos(int n)”. */

public class Ex9_ContaAlgarismos {
    public static void main(String[] args) {
        System.out.println(quantidadeAlgarismos(12345));
    }

    static int quantidadeAlgarismos(int n){
        if(n == 0){
            return 0;
        }

        return 1 + quantidadeAlgarismos(n/10);

    }

}