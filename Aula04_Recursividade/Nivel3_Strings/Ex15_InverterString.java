/*15. Inverter uma String ★★★
Objetivo: Construir um resultado recursivo em vez de apenas imprimir.
Pré-requisitos: Retorno de “String” e “substring()” ou índices.
Dica gradual: Pergunte o que deve ser retornado para uma String de tamanho 1 e como acrescentar o
primeiro/último caractere.
Enunciado: Implemente “String inverter(String texto)”. */

public class Ex15_InverterString {

    public static void main(String[] args) {
        String texto = "Clarissa";
        String invertido = inverter(texto);
        System.out.println(invertido);
    }

    static String inverter(String texto) {
        if (texto.length() <= 1) {
            return texto;
        } else {
            return texto.charAt(texto.length() - 1) + inverter(texto.substring(0, texto.length() - 1));
        }
    }
    
}
