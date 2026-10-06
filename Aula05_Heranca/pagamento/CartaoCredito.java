public class CartaoCredito extends Pagamento{

    private int parcelas;
    private double limite;

    public CartaoCredito(double limite){
        
    }

    public void passarCartao(double valor, int parcelas){

        System.out.println("Pagamento em " + parcelas + " de " + valor/parcelas);
        pagar(valor);

    }

}