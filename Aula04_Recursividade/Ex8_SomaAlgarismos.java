/*8. Soma dos algarismos ★★
Objetivo: Reduzir um número a uma parte menor.
Pré-requisitos: Divisão inteira e operador “%”.
Dica gradual: Como obter o último algarismo? O que sobra depois de removê-lo?
Enunciado: Implemente “int somaAlgarismos(int n)”. */

public class Ex8_SomaAlgarismos {
    public static void main(String[] args) {
        System.out.println(somaAlgarismos(999));
    }

    static int somaAlgarismos(int n){
        if(n == 0){
            return 0;
        }

        return n%10 + somaAlgarismos(n/10);

    }

}
