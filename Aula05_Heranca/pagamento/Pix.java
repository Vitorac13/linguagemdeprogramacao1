package Aula05_Heranca.pagamento;

public class Pix extends Pagamento {

    private String chavePix;
    private String tipoChave;

    public Pix(double valor, String chavePix, String tipoChave) {
        super(valor);
        this.chavePix = chavePix;
        this.tipoChave = tipoChave;
    }
}