/*12. Decimal para binário ★★
Objetivo: Compreender como a ordem das chamadas pode construir o resultado.
Pré-requisitos: Divisão inteira, “%” e “String”.
Dica gradual: O resto da divisão por 2 fornece um bit. Pense em quando esse bit deve ser
concatenado.
Enunciado: Implemente “String paraBinario(int n)” sem “Integer.toBinaryString()”. */

public class Ex12_DecimalBinario {
    public static void main(String[] args) {
        System.out.println(paraBinario(10));
    }

    static String paraBinario(int n){
        if(n == 0){
            return "";
        }

        int resto = n % 2;
        int quociente = n / 2;

        return paraBinario(quociente) + resto;
    }
}
