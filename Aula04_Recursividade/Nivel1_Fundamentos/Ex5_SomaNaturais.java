/*5. Soma dos primeiros naturais ★
Objetivo: Passar de impressão para retorno de valores.
Pré-requisitos: Tipos inteiros, retorno de métodos.
Dica gradual: Pense na relação entre soma(n) e soma(n-1).
Enunciado: Implemente “int soma(int n)” para retornar 1 + 2 + ... + n. */

public class Ex5_SomaNaturais {
    public static void main(String[] args) {
        System.out.print(soma(5));
    }

    static int soma(int n){
        if(n == 0){
            return 0;
        }

        return n + soma(n-1);

    }
}
