/*23. Contar ocorrências ★★★
Objetivo: Acumular resultados condicionais.
Pré-requisitos: Arrays e retorno.
Dica gradual: Cada posição contribui com 0 ou 1 para a resposta.
Enunciado: Implemente “int contar(int[] valores, int indice, int procurado)”. */

public class Ex23_ContarOcorrencias {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 3, 3};
        int resultado = contar(array, 0, 3);
        System.out.println("Número de ocorrências do valor 3: " + resultado);
    }

    static int contar(int[] valores, int indice, int procurado) {
        if (indice >= valores.length) {
            return 0;
        }
        int contagemAtual = (valores[indice] == procurado) ? 1 : 0;
        return contagemAtual + contar(valores, indice + 1, procurado);
    }
}
