/*11. MDC — Euclides ★★
Objetivo: Reconhecer uma relação recursiva em um algoritmo clássico.
Pré-requisitos: Operador “%” e condicionais.
Dica gradual: Observe “mdc(a,b) = mdc(b,a%b)”. O que acontece quando o resto chega a zero?
Enunciado: Implemente “int mdc(int a, int b)” pelo algoritmo de Euclides. */

public class Ex11_MDCEuclides {
    public static void main(String[] args) {
        System.out.println(mdc(48, 18));
    }

    static int mdc(int a, int b){
        if(b == 0){
            return a;
        }

        return mdc(b, a % b);
    }
}
