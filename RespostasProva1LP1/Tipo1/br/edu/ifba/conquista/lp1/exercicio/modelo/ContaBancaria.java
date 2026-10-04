package br.edu.ifba.conquista.lp1.exercicio.modelo;

public class ContaBancaria {
    private String numConta;
    private String nomeCorrentista;
    private double saldo;

    public ContaBancaria(String numConta, String nomeCorrentista, double saldo) {
        this.numConta = numConta;
        this.nomeCorrentista = nomeCorrentista;
        this.saldo = saldo;
    }

    public ContaBancaria(String numConta, String nomeCorrentista) {
        this.numConta = numConta;
        this.nomeCorrentista = nomeCorrentista;
        saldo = 0;
    }

    public String getNomeCorrentista() {
        return nomeCorrentista;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void alterarNome(String novoNome){
        nomeCorrentista = novoNome;
    }
    public void realizarDeposito(double valor){
        saldo += valor;
    }
    public void realizarSaque(double valor){
        if(saldo >= valor) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
            return;
        }
    }
}
