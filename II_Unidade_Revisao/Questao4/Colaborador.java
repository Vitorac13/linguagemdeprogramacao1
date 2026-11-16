package II_Unidade_Revisao.Questao4;

public abstract class Colaborador implements Bonificavel {
    
    private String nome;
    private double salarioBase;

    public Colaborador(String nome, double salarioBase){
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome(){
        return nome;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public double calcularRemuneracao(){
        return salarioBase + calcularBonus();
    }

}
