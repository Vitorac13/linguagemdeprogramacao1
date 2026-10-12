/*21. Soma do array ★★★
Objetivo: Generalizar a ideia de soma recursiva.
Pré-requisitos: Arrays e retorno inteiro.
Dica gradual: A soma do array pode ser o elemento atual mais a soma do restante.

Enunciado: Implemente “int soma(int[] valores, int indice)”. */

public class Ex21_SomaArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int resultado = soma(array, 0);
        System.out.println("Soma do array: " + resultado);
    }
    
    static int soma(int[] valores, int indice) {
        if (indice >= valores.length) {
            return 0;
        }
        return valores[indice] + soma(valores, indice + 1);
    }
}
