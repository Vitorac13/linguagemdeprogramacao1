/*30. Torres de Hanói ★★★★★
Objetivo: Compreender uma decomposição recursiva composta por várias etapas.
Pré-requisitos: Métodos, parâmetros, múltiplas chamadas recursivas e raciocínio algorítmico.
Dica gradual: Para mover n discos, primeiro mova n-1 para a haste auxiliar, mova o maior para o
destino e depois mova n-1 da auxiliar para o destino.
Enunciado: Implemente “void hanoi(int quantidadeDiscos, char origem, char destino, char auxiliar)”.
Depois implemente “long quantidadeMovimentos(int n)”. */

public class Ex30_TorresHanoi {
    public static void main(String[] args) {
        int quantidadeDiscos = 3;
        System.out.println("Movimentos para resolver as Torres de Hanói com " + quantidadeDiscos + " discos:");
        hanoi(quantidadeDiscos, 'A', 'C', 'B');
    }
    public static void hanoi(int quantidadeDiscos, char origem, char destino, char auxiliar) {
        if (quantidadeDiscos == 1) {
            System.out.println("Mover disco 1 de " + origem + " para " + destino);
            return;
        }

        hanoi(quantidadeDiscos - 1, origem, auxiliar, destino);
        System.out.println("Mover disco " + quantidadeDiscos + " de " + origem + " para " + destino);
        hanoi(quantidadeDiscos - 1, auxiliar, destino, origem);
    }
}
