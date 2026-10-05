public class Inverter{

    public static void main(String[] args) {

        //String nome = "Claudio";
        //inverter(nome, nome.length());
        inverterSub("Vitor");

    }

    /*static void inverter(String nome, int tamanho){
        if(tamanho == 0) return;
        System.out.println(nome.charAt(tamanho-1));
        inverter(nome, tamanho-1);
    }*/

    static void inverterSub(String nome){
        if(nome.length() == 0) return;
        System.out.println(nome.charAt(nome.length()-1));
        String parte = nome.substring(0, (nome.length()-1));
        inverterSub(parte);
    }

}