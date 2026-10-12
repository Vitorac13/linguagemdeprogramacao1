/*10. Maior algarismo ★★
Objetivo: Usar o resultado da chamada recursiva para construir a resposta.
Pré-requisitos: Condicionais, “%” e divisão.
Dica gradual: Separe o último algarismo do restante. Compare o atual com o maior encontrado no
restante.
Enunciado: Implemente “int maiorAlgarismo(int n)”. */

public class Ex10_MaiorAlgarismo {
    public static void main(String[] args) {
        System.out.println(maiorAlgarismo(12345));
    }

    static int maiorAlgarismo(int n){
        if(n < 10){
            return n;
        }

        int ultimo = n % 10;
        int resto = n / 10;

        int maiorResto = maiorAlgarismo(resto);

        if(ultimo > maiorResto){
            return ultimo;
        } else {
            return maiorResto;
        }
    }
}