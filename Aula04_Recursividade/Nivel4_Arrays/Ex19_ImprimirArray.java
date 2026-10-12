/*19. Imprimir array ★★★
Objetivo: Transferir o raciocínio de índices de String para arrays.
Pré-requisitos: Arrays, índices e “length”.
Dica gradual: Use o índice como estado. Pare quando chegar ao tamanho do array.
Enunciado: Implemente “void imprimir(int[] valores, int indice)”. */

public class Ex19_ImprimirArray {

    public static void main(String[] args) {
        int[] valores = {1, 2, 3, 4, 5};
        imprimir(valores, 0);
    }

    static void imprimir(int[] valores, int indice) {
        if (indice < valores.length) {
            System.out.println(valores[indice]);
            imprimir(valores, indice + 1);
        }
    }
    
}
