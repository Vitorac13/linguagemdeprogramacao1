package II_Unidade_Revisao.Questao1;

public class Pessoa{

    private String nome;
    private String cpf;

    public Pessoa (String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome(){
        return nome;
    }

    public String getCpf(){
        return nome;
    }

    public void exibirDados(){
        System.out.println("Nome: " + nome);
        System.out.println("Cpf: " + cpf);
    }

}