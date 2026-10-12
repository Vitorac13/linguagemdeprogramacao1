package Aula05_Heranca.pagamento;

public class CartaoCredito extends Pagamento {

    private String numeroCartao;
    private String nomeTitular;
    private int parcelas;

    public CartaoCredito(double valor, String numeroCartao, String nomeTitular, int parcelas) {
        super(valor);
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
        this.parcelas = parcelas;
    }
}