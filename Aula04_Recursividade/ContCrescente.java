public class ContCrescente {
    
    public static void main(String[] args){

        Recursividade rec = new Recursividade();
        rec.contagemIt(3);
        rec.contagemRec(5);
    
    }

}

class Recursividade{

    public void contagemIt(int n){
        for(int i=1; i<=n; i++){
            System.out.println(i);
        }
    }

    public void contagemRec(int n){
        if(n == 0) return;
        contagemRec(n-1);
        System.out.println(n);
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
