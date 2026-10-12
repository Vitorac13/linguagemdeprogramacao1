/*26. Fibonacci ★★★★
Objetivo: Compreender problemas que geram duas chamadas recursivas.
Pré-requisitos: Retorno inteiro/long e condicionais.
Dica gradual: Defina claramente os dois casos base antes de escrever a chamada dupla.
Enunciado: Implemente “long fibonacci(int n)” recursivamente e observe o crescimento do número de
chamadas. */

public class Ex26_Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(8));
    }

    static long fibonacci(int n){
        if(n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);

    }
}
