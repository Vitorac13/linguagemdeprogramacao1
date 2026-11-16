package II_Unidade_Revisao.Questao3;

public class PagamentoDinheiro implements Pagavel{

    @Override 
    public void pagar(double valor){
        System.out.println("O pagamento de: R$ " + valor + " foi feito em dinheiro");
    }

}
