/*16. Contar caractere ★★★
Objetivo: Acumular resultados de chamadas recursivas.
Pré-requisitos: String, “charAt()” e retorno inteiro.

Dica gradual: A resposta para o texto completo depende de saber se o caractere atual coincide e da
resposta para o restante.
Enunciado: Implemente “int contar(String texto, char caractere)”. */

public class Ex16_ContarCaractere {

    public static void main(String[] args) {
        String texto = "Clarissa";
        char caractere = 'a';
        int quantidade = contar(texto, caractere);
        System.out.println(quantidade);
    }

    static int contar(String texto, char caractere) {
        if (texto.length() == 0) {
            return 0;
        } else {
            int count = (texto.charAt(0) == caractere) ? 1 : 0;
            return count + contar(texto.substring(1), caractere);
        }
    }
    
}