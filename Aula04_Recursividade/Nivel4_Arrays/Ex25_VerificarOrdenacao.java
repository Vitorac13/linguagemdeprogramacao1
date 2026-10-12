/*25. Verificar ordenação ★★★
Objetivo: Comparar elementos vizinhos e reduzir o intervalo.
Pré-requisitos: Arrays, índices e booleanos.
Dica gradual: Compare valores consecutivos. Se a relação estiver correta, verifique o restante.
Enunciado: Implemente “boolean estaOrdenado(int[] valores, int indice)”. */

public class Ex25_VerificarOrdenacao {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        boolean resultado = estaOrdenado(array, 0);
        System.out.println("O array está ordenado: " + resultado);
    }

    static boolean estaOrdenado(int[] valores, int indice) {
        if (indice >= valores.length - 1) {
            return true;
        }
        if (valores[indice] > valores[indice + 1]) {
            return false;
        }
        return estaOrdenado(valores, indice + 1);
    }
}
