/*20. Array na ordem inversa ★★★
Objetivo: Combinar índice e ordem de execução.
Pré-requisitos: Arrays e índices.
Dica gradual: Pense em imprimir o elemento depois que a chamada recursiva retornar.
Enunciado: Implemente a impressão inversa sem criar outro array. */

public class Ex20_ArrayInverso {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        imprimirInverso(array, 0);
    }

    static void imprimirInverso(int[] array, int index) {
        if (index < array.length) {
            imprimirInverso(array, index + 1);
            System.out.print(array[index] + " ");
        }
    }
}
