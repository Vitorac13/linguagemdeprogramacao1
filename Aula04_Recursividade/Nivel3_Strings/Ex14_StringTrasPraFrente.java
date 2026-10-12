/*14. String de trás para frente ★★★
Objetivo: Perceber novamente o efeito da posição da chamada recursiva.
Pré-requisitos: String e índices.
Dica gradual: Se a chamada acontecer antes da impressão, os caracteres posteriores podem aparecer
primeiro.
Enunciado: Implemente a impressão inversa de uma String. */

public class Ex14_StringTrasPraFrente {
    public static void main(String[] args) {
        imprimir("Olá, mundo!", 0);
    }
    static void imprimir(String texto, int indice) {
        if (indice < texto.length()) {
            imprimir(texto, indice + 1);
            System.out.print(texto.charAt(indice));
        }
    }
}
