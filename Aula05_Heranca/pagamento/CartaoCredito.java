package Aula05_Heranca.pagamento;

import java.time.LocalDateTime;

public class CartaoCredito extends Pagamento {

    private String numeroCartao;
    private String nomeTitular;
    private int parcelas;

    public CartaoCredito(double valor, LocalDateTime horaPagamento, String numeroCartao, String nomeTitular, int parcelas) {
        super(valor, horaPagamento);
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.parcelas = parcelas;
    }
}