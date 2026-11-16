package II_Unidade_Revisao.Questao3;

public class PagamentoCartao implements Pagavel {

    private int numeroParcelas;

    public PagamentoCartao(int numeroParcelas){
        this.numeroParcelas = numeroParcelas;
    }

    @Override 
    public void pagar(double valor){
        System.out.println("O pagamento de: R$ " + valor + " foi dividido em " + numeroParcelas + " vezes");
    }
    
}
