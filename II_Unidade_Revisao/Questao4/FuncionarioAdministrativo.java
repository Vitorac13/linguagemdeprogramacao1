package II_Unidade_Revisao.Questao4;

public class FuncionarioAdministrativo extends Colaborador implements Bonificavel {
    
    public FuncionarioAdministrativo (String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override 
    public double calcularBonus(){
        return getSalarioBase() / 10;
    }

}
