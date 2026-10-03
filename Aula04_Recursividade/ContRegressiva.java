public class ContRegressiva{

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
    