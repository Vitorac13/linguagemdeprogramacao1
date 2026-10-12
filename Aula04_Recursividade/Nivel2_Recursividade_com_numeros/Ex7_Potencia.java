/*7. Potência ★★
Objetivo: Aplicar recursividade a uma operação repetitiva.
Pré-requisitos: Retorno e multiplicação.
Dica gradual: Pense em base^expoente em função de base^(expoente-1).
Enunciado: Implemente “long potencia(int base, int expoente)” sem “Math.pow()”. */

public class Ex7_Potencia {
    public static void main(String[] args) {
        System.out.println(potencia(5,3));
    }

    static long potencia(int base, int expoente){
        if(expoente == 0){
            return 1;
        }

        return base * potencia(base, expoente-1);

    }
}
