package II_Unidade_Revisao.Questao4;

public class Professor extends Colaborador implements Bonificavel {
    
    private int quantidadeTurmas;

    public Professor (String nome, double salarioBase, int quantidadeTurmas){
        super(nome, salarioBase);
        this.quantidadeTurmas = quantidadeTurmas;
    }

    @Override 
    public double calcularBonus(){
        return (getSalarioBase() / 20) * quantidadeTurmas;
    }
}
