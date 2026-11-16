package II_Unidade_Revisao.Questao1;

class Aluno extends Pessoa{

    private String matricula;

    public Aluno (String nome, String cpf, String matricula){
        super(nome, cpf);
        this.matricula = matricula;
    }
    
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Matricula: " + matricula);
    }

}