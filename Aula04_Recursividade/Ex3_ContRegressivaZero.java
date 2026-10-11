/*3. Contagem regressiva com zero ★
Objetivo: Aprimorar a identificação do caso base.
Pré-requisitos: Condicionais e métodos.
Dica gradual: O zero deve ser impresso? Decida primeiro qual é a condição de parada.
Enunciado: Modifique a contagem regressiva para terminar em 0. */

public class Ex3_ContRegressivaZero{

    public static void main(String[] args) {
        Recursividade rec = new Recursividade();
        rec.ContRegressivaIt(3);
        rec.ContRegressivaRec(3);
    }
}

class Recursividade{

    public void ContRegressivaIt(int n){
        for(int i=n; i>=0; i--){
            System.out.println(i);
        }
    }

    public void ContRegressivaRec(int n){
        if(n == -1) return;
        System.out.println(n);
        ContRegressivaRec(n-1);
    }
}
    