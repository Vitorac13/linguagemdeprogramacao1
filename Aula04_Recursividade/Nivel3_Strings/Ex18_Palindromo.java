/*18. Palíndromo ★★★
Objetivo: Reduzir o problema pelas duas extremidades.
Pré-requisitos: String, índices e booleanos.
Dica gradual: Compare o primeiro e o último caractere. Se forem iguais, repita a análise no intervalo
interno.
Enunciado: Implemente “boolean ehPalindromo(String texto)”. Não use “reverse()”. */

public class Ex18_Palindromo {
    public static void main(String[] args) {
        String texto = "arara";
        boolean resultado = ehPalindromo(texto);
        System.out.println(resultado);
    }
    
    static boolean ehPalindromo(String texto) {
        if (texto.length() <= 1) {
            return true;
        } else {
            char primeiro = Character.toLowerCase(texto.charAt(0));
            char ultimo = Character.toLowerCase(texto.charAt(texto.length() - 1));
            if (primeiro != ultimo) {
                return false;
            } else {
                return ehPalindromo(texto.substring(1, texto.length() - 1));
            }
        }
    }
}
