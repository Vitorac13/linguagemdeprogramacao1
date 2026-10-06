public class Gato extends Animal {
    
    public Gato(String nome){
        setNome(nome);
    }

    public void miar(){
        System.out.println(nome + " Miau...");
    }

}