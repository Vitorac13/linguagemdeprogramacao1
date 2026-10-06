// Uma interface define um comportamento
public interface ComportamentoAnimal {
    void comer();
    void dormir();
}

public class Animal implements ComportamentoAnimal{

    protected String nome;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void comer(){
        System.out.println("Comendo...");
    }

    public void dormir(){
        System.out.println("Dormindo...");
    }

}