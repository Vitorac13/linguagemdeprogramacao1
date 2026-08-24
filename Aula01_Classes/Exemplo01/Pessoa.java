public class Pessoa {
    private String nome;
    private String sexo;
    private String cpf;
    private LocalDate dataNascimento;

    public Pessoa(String nome, String sexo, String cpf, LocalDate dataNascimento){
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }
    public Pessoa(String nome){
        this.nome = nome;
    }

    LocalDate d = new LocalDate(now());
    Pessoa p = new Pessoa("Vitor", "M", "12321123321", d);
}
