/*13. Imprimir String caractere a caractere ★★★
Objetivo: Transferir a ideia de índice para uma sequência de caracteres.
Pré-requisitos: String, “charAt()” e “length()”.
Dica gradual: O índice começa em 0. O caso base ocorre quando o índice chega ao tamanho da
String.
Enunciado: Implemente “void imprimir(String texto, int indice)”. */

public class Ex13_ImprimirString {
    public static void main(String[] args) {
        imprimir("Olá, mundo!", 5);
    }

    static void imprimir(String texto, int indice) {
        if (indice < texto.length()) {
            System.out.print(texto.charAt(indice));
            imprimir(texto, indice + 1);
        }
    }
}
