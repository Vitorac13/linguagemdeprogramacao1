/*6. Fatorial ★★
Objetivo: Reconhecer uma definição matemática naturalmente recursiva.
Pré-requisitos: Retorno de métodos e multiplicação.
Dica gradual: Compare n! com (n-1)!. Qual é o menor fatorial?
Enunciado: Implemente “long fatorial(int n)”. Considere 0! = 1. */

public class Ex6_Fatorial{
    public static void main(String[] args){

        Recursividade rec = new Recursividade();
        System.out.println(rec.fatorialIt(5));
        System.out.println(rec.fatorialRec(5));

    }
}

class Recursividade{
    private int fat;

    public int fatorialIt(int num){
        fat = 1;
        for(int i=num; i>0; i--){
            fat *= i;
        }
        return fat;
    }

    public int fatorialRec(int num){
        if(num == 0) return 1;
        return num * fatorialRec(num-1);
    }
}