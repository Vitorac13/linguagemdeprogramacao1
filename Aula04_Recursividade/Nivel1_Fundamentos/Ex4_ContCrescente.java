/*4. Contagem crescente com estado ★
Objetivo: Entender parâmetros que representam o estado atual.
Pré-requisitos: Métodos, parâmetros e condicionais.
Dica gradual: Use dois parâmetros: um representa onde você está e outro onde deve chegar.
Enunciado: Implemente “void contarCrescente(int atual, int limite)”. */

public class Ex4_ContCrescente {
    
    public static void main(String[] args){

        Recursividade rec = new Recursividade();
        rec.contagemIt(3, 6);
        rec.contagemRec(3, 10);
    
    }

}

class Recursividade{

    public void contagemIt(int atual, int limite){
        for(int i=atual; i<=limite; i++){
            System.out.println(i);
        }
    }

    public void contagemRec(int atual, int limite){
        if(limite == atual-1) return;
        contagemRec(atual, limite-1);
        System.out.println(limite);
    }
}

//cont(5) - cont(4)
//cont(4) - cont(3)
//cont(3) - cont(2)
//cont(2) - cont(1)
//cont(1) - cont(0)
//FIM - Executa o que estava pendente
//cont(1) - 1
//cont(2) - 2
//cont(3) - 3
//cont(4) - 4
//cont(5) - 5
