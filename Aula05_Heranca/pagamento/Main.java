package Aula05_Heranca.pagamento;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        CartaoCredito cartao = new CartaoCredito(500.00, LocalDateTime.now(), "123456789", "João", 5);
        System.out.println(cartao.getStatus());
        cartao.realizarPagamento();
        System.out.println(cartao.getStatus());


        Pix pix = new Pix(200.00, LocalDateTime.now(), "joao@email.com", "EMAIL");
        System.out.println(pix.getStatus());


        cartao.realizarPagamento();
        pix.realizarPagamento();
    }

}
