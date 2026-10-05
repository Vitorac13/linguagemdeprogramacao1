public class Inverter{

    public static void main(String[] args) {

        inverterSub("Vitor");

    }

    static void inverterSub(String nome){
        if(nome.length() == 0) return;
        System.out.println(nome.charAt(nome.length()-1));
        String parte = nome.substring(0, (nome.length()-1));
        inverterSub(parte);
    }

}