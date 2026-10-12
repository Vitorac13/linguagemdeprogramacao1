/*2. Contagem regressiva ★
Objetivo: Perceber que a posição da chamada recursiva influencia a saída.
Pré-requisitos: Métodos e condicionais.
Dica gradual: Compare mentalmente uma chamada antes e depois do “println”.
Enunciado: Implemente “void contagemRegressiva(int n)” para imprimir n até 1. */

public class Ex2_ContRegressiva{

    public static void main(String[] args) {
        Recursividade rec = new Recursividade();
        rec.ContRegressivaIt(3);
        rec.ContRegressivaRec(3);
    }
}

class Recursividade{

    public void ContRegressivaIt(int n){
        for(int i=n; i>0; i--){
            System.out.println(i);
        }
    }

    public void ContRegressivaRec(int n){
        if(n == 0) return;
        System.out.println(n);
        ContRegressivaRec(n-1);
    }
}
    