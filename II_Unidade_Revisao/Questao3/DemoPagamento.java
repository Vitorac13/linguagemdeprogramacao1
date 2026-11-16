/*Questão 3 – Interfaces (2,0 pontos)
Um sistema de pagamentos precisa permitir diferentes formas de pagamento. Para isso, implemente uma interface chamada Pagavel.

A interface deve possuir o método:

- pagar(double valor): responsável por realizar um pagamento.

Implemente as seguintes classes:
- PagamentoPix: deve implementar a interface Pagavel e apresentar uma mensagem informando que o pagamento foi realizado via PIX.
- PagamentoCartao: deve implementar a interface Pagavel e possuir o atributo numeroParcelas. Ao realizar o pagamento, deve apresentar o valor e a quantidade de parcelas.
- PagamentoDinheiro: deve implementar a interface Pagavel e apresentar uma mensagem informando que o pagamento foi realizado em dinheiro.
Crie uma classe DemoPagamento, com método void main(), que:
1. Crie um arranjo de objetos do tipo Pagavel.
2. Armazene diferentes formas de pagamento nesse arranjo.
3. Percorra o arranjo e invoque o método pagar() para cada objeto.
Objetivo: Aplicar interfaces, implementação de contratos e polimorfismo.*/

package II_Unidade_Revisao.Questao3;

public class DemoPagamento{
 
    public static void main(String[] args) {
        
        Pagavel[] pagamentos = new Pagavel[3];

        pagamentos[0] = new PagamentoCartao(5);
        pagamentos[1] = new PagamentoPix();
        pagamentos[2] = new PagamentoDinheiro();

        pagamentos[0].pagar(1234);
        pagamentos[1].pagar(100);
        pagamentos[2].pagar(75);

    }

}