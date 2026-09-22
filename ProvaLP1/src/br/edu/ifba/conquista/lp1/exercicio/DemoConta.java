package br.edu.ifba.conquista.lp1.exercicio;
import br.edu.ifba.conquista.lp1.exercicio.modelo.ContaCorrente;

public class DemoConta {
    public static void main(String[] args) {

        ContaCorrente contaJoao = new ContaCorrente("12345", "Joao Vitor Carvalho", 10000.27);
        ContaCorrente contaVitor = new ContaCorrente("54321", "Vitor Almeida Costa");

        System.out.println("Saldo de " + contaJoao.getNomeCorrentista() + ": " + contaJoao.consultarSaldo());
        System.out.println("Saldo de Vitor: " + contaVitor.consultarSaldo());

        contaJoao.alterarNome("Joao Vitor Carvalho Pereira");

        contaVitor.realizarDeposito(13131.3);
        contaJoao.realizarSaque(20000);
        contaJoao.realizarSaque(5000);

        System.out.println("Saldo pós saque de Joao: " + contaJoao.consultarSaldo());
        System.out.println("Saldo pós depósito de Vitor: " + contaVitor.consultarSaldo());


    }
}