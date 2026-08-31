package Biblioteca;

class Usuario{
    private id_usuario;
    private String cpf;
    private String nome;
    private String email;
    private String senha;
    private int dataNascimento;
   
    public Usuario(int id_usuario, String cpf, String nome, String email, String senha, int dataNascimento){
        this.id_usuario = id_usuario;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataNascimento = dataNascimento;
    }
}