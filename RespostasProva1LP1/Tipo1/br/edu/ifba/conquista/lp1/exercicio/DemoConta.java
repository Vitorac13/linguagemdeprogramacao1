package br.edu.ifba.conquista.lp1.exercicio;

import br.edu.ifba.conquista.lp1.exercicio.modelo.ContaBancaria;

public class DemoConta {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("12345", "Vitor", 15313.13);
        ContaBancaria conta2 = new ContaBancaria("54321", "Joao");

        System.out.println("saldo inicial conta1: " + conta1.consultarSaldo());
        System.out.println("saldo inicial conta2: " + conta2.consultarSaldo());

        conta1.alterarNome("Mateus");
        conta1.realizarSaque(1000);
        System.out.println("Saldo atual de " + conta1.getNomeCorrentista() + " é : R$" + conta1.consultarSaldo());

        conta2.realizarDeposito(13000.26);
        System.out.println("Saldo atual de " + conta2.getNomeCorrentista() + " é : R$" + conta2.consultarSaldo());

    }
}
