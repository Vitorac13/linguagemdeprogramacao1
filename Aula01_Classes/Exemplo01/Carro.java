public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private String proprietario;

    public Carro(String marca, String modelo, int ano, String placa, String proprietario){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.proprietario = proprietario;
    }

    public setChassi(int chassi){
        if(chassi.length < 10){
            throw IllegalArgumentException("Chassi deve conter 7 digitos");
        }
    }

    public String venderCarro(String proprietario){
        this.proprietario = IO.readln("Digite o nome do novo proprietario: ");
        System.out.println("O carro foi transferido");
    }

}
