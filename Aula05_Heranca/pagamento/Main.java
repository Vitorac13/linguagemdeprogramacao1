package Aula05_Heranca.pagamento;

public class Main {

    public static void main(String[] args) {

        CartaoCredito cartao = new CartaoCredito(500.00, "123456789", "João", 5);

        System.out.println(cartao.getStatus());

        cartao.realizarPagamento();

        System.out.println(cartao.getStatus());
        System.out.println(cartao.getHoraPagamento());

        System.out.println("--------------------");

        Pix pix = new Pix(200.00, "joao@email.com", "EMAIL");

        System.out.println(pix.getStatus());

        pix.realizarPagamento();

        System.out.println(pix.getStatus());
        System.out.println(pix.getHoraPagamento());
    }
}