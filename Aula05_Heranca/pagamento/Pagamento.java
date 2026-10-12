package Aula05_Heranca.pagamento;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Pagamento {

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    
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
        
        String horaFormatada = horaPagamento.format(formatter);

        System.out.println("Pagamento realizado com sucesso!");
        System.out.println("Data e hora: " + horaFormatada);
    }

    public double getValor() {
        return valor;
    }

    public String getHoraPagamento() {
        String horaFormatada = horaPagamento.format(formatter);
        return horaFormatada;
    }

    public String getStatus() {
        return status;
    }
}