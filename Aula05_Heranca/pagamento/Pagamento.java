public class Pagamento{

    protected double valor;
    protected String vendedor;
    protected String cliente;

    public double getValor(){
        return valor;
    }

    public void setValor(double valor){
        this.valor = valor;
    }

    public void pagar(valor){
        System.out.print(cliente + " está pagando " + valor + " ao " + vendedor);
    }

}