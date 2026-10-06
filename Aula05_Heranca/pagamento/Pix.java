public class Pix extends Pagamento{

    private double saldo;

    public Pix(double saldo){
        
    }

    public void passarCartao(double valor, int parcelas){

        System.out.println("Pagamento em " + parcelas + " de " + valor/parcelas);
        pagar(valor);

    }

}