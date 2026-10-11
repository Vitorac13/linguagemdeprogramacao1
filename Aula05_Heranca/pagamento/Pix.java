package Aula05_Heranca.pagamento;

import java.time.LocalDateTime;

public class Pix extends Pagamento {

    private String chavePix;
    private String tipoChave;

    public Pix(double valor, LocalDateTime horaPagamento, String chavePix, String tipoChave) {
        super(valor, horaPagamento);
        this.chavePix = chavePix;
        this.tipoChave = tipoChave;
    }
}