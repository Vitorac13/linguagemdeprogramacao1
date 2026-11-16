/*Questão 5 – Recursividade (2,0 pontos)
Implemente uma classe chamada OperacoesRecursivas, contendo os seguintes métodos recursivos:

a) Fatorial

Implemente o método fatorial(int n), que recebe um número inteiro positivo e retorna seu fatorial.

Exemplo:
- fatorial(5) deve retornar 120.
- fatorial(4) deve retornar 24.
b) Soma dos números

Implemente o método somar(int n), que recebe um número inteiro positivo e retorna a soma de todos os números inteiros de 1 até n.

Exemplo:
- somar(5) deve retornar 15.
- somar(4) deve retornar 10.
c) Potenciação

Implemente o método potencia(int base, int expoente), que calcula a potência de um número utilizando recursividade, sem utilizar o método Math.pow().

Exemplo:
- potencia(2, 3) deve retornar 8.
- potencia(5, 2) deve retornar 25.
Crie uma classe DemoRecursividade, com método void main(), para testar os três métodos.

Objetivo: Compreender a recursividade, identificando os casos-base e as chamadas recursivas.*/

package II_Unidade_Revisao.Questao5;

public class DemoRecursividade{
    
    public static void main(String[] args) {
        
        OperacoesRecursivas operacoesRecursivas = new OperacoesRecursivas();

        System.out.println(operacoesRecursivas.fatorial(5));
        System.out.println(operacoesRecursivas.somar(5));
        System.out.println(operacoesRecursivas.potencia(2, 3));
        
    }

}

class OperacoesRecursivas{

    public int fatorial(int n){
        if (n == 0) return 1;
        return n * fatorial(n-1);
    }

    public int somar(int n){
        if(n == 0) return 0;
        return n + somar(n-1);
    }

    public int potencia(int base, int expoente){
        if(expoente == 0) return 1;
        return base * potencia(base, expoente-1);       
    }

}