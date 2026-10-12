package Aula05_Heranca.pagamento;

import java.time.LocalDateTime;

public class Pagamento {

    protected double valor;
    protected LocalDateTime horaPagamento;
    protected String status;

    public Pagamento(double valor) {
        this.valor = valor;
        this.horaPagamento = null;
        this.status = "PENDENTE";
    }

    public void realizarPagamento() {
        this.horaPagamento = LocalDateTime.now();
        this.status = "PAGO";

        System.out.println("Pagamento realizado com sucesso!");
        System.out.println("Data e hora: " + horaPagamento);
    }

    public double getValor() {
        return valor;
    }

    public LocalDateTime getHoraPagamento() {
        return horaPagamento;
    }

    public String getStatus() {
        return status;
    }
}