package II_Unidade_Revisao.Questao3;

public class PagamentoPix implements Pagavel{

    @Override 
    public void pagar(double valor){
        System.out.println("O pagamento foi realizado via PIX, no valor de: R$ " + valor);
    }
    
}
