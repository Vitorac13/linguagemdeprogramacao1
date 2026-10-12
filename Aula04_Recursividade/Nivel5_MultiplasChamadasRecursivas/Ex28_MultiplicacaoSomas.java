/*28. Multiplicação por somas ★★★★
Objetivo: Construir uma operação usando uma definição recursiva.
Pré-requisitos: Soma, condicionais e retorno.
Dica gradual: “a*b” pode ser visto como “a + a*(b-1)”. Pense também em b = 0 e em números
negativos.
Enunciado: Implemente “int multiplicar(int a, int b)” sem usar “*”. */

public class Ex28_MultiplicacaoSomas {
    public static void main(String[] args) {
        System.out.println(multiplicar(5, -4));
    }

    static int multiplicar(int a, int b) {
        if (b == 0) {
            return 0;
        }
        if (b == 1) {
            return a;
        }
        if (b < 0) {
            return multiplicar(-a, -b);
        }
        return a + multiplicar(a, b - 1);
    }
}
