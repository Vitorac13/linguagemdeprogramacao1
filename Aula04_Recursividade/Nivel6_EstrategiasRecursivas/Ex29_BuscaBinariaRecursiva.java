/*29. Busca binária recursiva ★★★★
Objetivo: Aplicar recursividade à redução do espaço de busca.
Pré-requisitos: Arrays ordenados, índices e divisão inteira.
Dica gradual: Compare o elemento central com o procurado. Descarte metade do intervalo e repita.
Enunciado: Implemente “int buscaBinaria(int[] valores, int inicio, int fim, int procurado)”. Retorne -1 se
não encontrar. */

public class Ex29_BuscaBinariaRecursiva {

    public static void main(String[] args) {
        int[] valores = {1, 3, 5, 7, 9, 11, 13, 15};
        int procurado = 7;
        int resultado = buscaBinaria(valores, 0, valores.length - 1, procurado);

        if (resultado != -1) {
            System.out.println("Elemento encontrado no índice: " + resultado);
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }

    static int buscaBinaria(int[] valores, int inicio, int fim, int procurado) {
        if (inicio > fim) {
            return -1;
        }

        int meio = (inicio + fim) / 2;

        if (valores[meio] == procurado) {
            return meio;
        } else if (valores[meio] < procurado) {
            return buscaBinaria(valores, meio + 1, fim, procurado);
        } else {
            return buscaBinaria(valores, inicio, meio - 1, procurado);
        }
    }
}
