package br.com.fatorial;

public class Fatorial{
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
        fat = 1;
        if(num == 0) return 1;
        return num * fatorialRec(num-1);
    }
}