package Aula05_Heranca.pagamento;

import java.time.LocalDateTime;

public class Pagamento{

    protected double valor;
    protected LocalDateTime horaPagamento;
    protected String status;

    public Pagamento(double valor, LocalDateTime horaPagamento) {
        this.valor = valor;
        this.horaPagamento = horaPagamento;
        this.status = "PENDENTE";
    }

    public void realizarPagamento() {
        this.status = "PAGO";
        System.out.println("Pagamento realizado com sucesso!");
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