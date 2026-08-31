package Biblioteca;

class Emprestimo{
    private int id_emprestimo;
    private int id_usuario;
    private int id_livro;
    private localDate dataEmprestimo;
    private localDate dataDevolucao;

    public Emprestimo(int id_emprestimo, int id_usuario, int id_livro, localDate dataEmprestimo, localDate dataDevolucao){
        this.id_emprestimo = id_emprestimo;
        this.id_usuario = id_usuario;
        this.id_livro = id_livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }
}