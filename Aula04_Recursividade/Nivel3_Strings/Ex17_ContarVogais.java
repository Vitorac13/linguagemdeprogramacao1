/*17. Contar vogais ★★★
Objetivo: Combinar uma condição com uma chamada recursiva.
Pré-requisitos: String, condicionais e métodos auxiliares.
Dica gradual: Crie uma condição que determine se um caractere é vogal e some 1 ou 0 ao resultado
recursivo.
Enunciado: Implemente “int contarVogais(String texto)”. */

public class Ex17_ContarVogais {
    public static void main(String[] args) {
        String texto = "Clarissa";
        int quantidade = contarVogais(texto);
        System.out.println(quantidade);
    }

    static int contarVogais(String texto) {
        if (texto.length() == 0) {
            return 0;
        } else {
            char caractere = Character.toLowerCase(texto.charAt(0));
            int count = (caractere == 'a' || caractere == 'e' || caractere == 'i' || caractere == 'o' || caractere == 'u') ? 1 : 0;
            return count + contarVogais(texto.substring(1));
        }
    }
}
