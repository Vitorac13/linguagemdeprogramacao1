package br.edu.ifba.conquista.lp1.exercicio.modelo;

public class ContaCorrente {
    private String numeroConta;
    private String nomeCorrentista;
    private double saldo;

    public ContaCorrente(String numeroConta, String nomeCorrentista){
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        saldo = 0;
    }

    public ContaCorrente(String numeroConta, String nomeCorrentista, double saldo){
        this.numeroConta = numeroConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public String getNomeCorrentista(){
        return nomeCorrentista;
    }

    public void alterarNome(String nomeCorrentista){
        this.nomeCorrentista = nomeCorrentista;
    }

    public void realizarDeposito(double valor){
        saldo += valor;
    }

    public void realizarSaque(double valor){
        if(saldo >= valor) {
            saldo -= valor;
        }
        else System.out.println("Você não possui saldo para realizar esse saque de: " + valor);
    }

    public double consultarSaldo(){
        return saldo;
    }
}
