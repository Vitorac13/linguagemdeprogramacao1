/*24. Verificar existência ★★★
Objetivo: Usar retorno booleano e encerramento antecipado.
Pré-requisitos: Arrays, booleanos e condicionais.
Dica gradual: Se encontrar o valor, não há necessidade de continuar procurando.
Enunciado: Implemente “boolean existe(int[] valores, int indice, int procurado)”. */

public class Ex24_VerificarExistencia {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        boolean resultado = existe(array, 0, 3);
        System.out.println("O valor 3 existe no array: " + resultado);
    }

    static boolean existe(int[] valores, int indice, int procurado) {
        if (indice >= valores.length) {
            return false;
        }
        if (valores[indice] == procurado) {
            return true;
        }
        return existe(valores, indice + 1, procurado);
    }
}
