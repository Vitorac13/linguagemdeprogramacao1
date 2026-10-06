public class Cachorro extends Animal {
    
    public Cachorro(String nome){
        setNome(nome);
    }

    public void latir(){
        System.out.println(nome + " Au au...");
    }

}

class Caramelo extends Cachorro {
    
    public Caramelo(String nome){
        super(nome);
    }

}