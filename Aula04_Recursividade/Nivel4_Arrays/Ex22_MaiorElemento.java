/*22. Maior elemento ★★★
Objetivo: Comparar um valor atual com o resultado recursivo.
Pré-requisitos: Arrays, condicionais e retorno.
Dica gradual: Primeiro resolva o problema do último elemento. Depois compare cada elemento com o
maior do restante.
Enunciado: Implemente “int maior(int[] valores, int indice)”. */

public class Ex22_MaiorElemento {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int resultado = maior(array, 0);
        System.out.println("Maior elemento do array: " + resultado);
    }
    
    static int maior(int[] valores, int indice) {
        if (indice >= valores.length - 1) {
            return valores[indice];
        }
        int maiorDoRestante = maior(valores, indice + 1);
        return Math.max(valores[indice], maiorDoRestante);
    }
}
