package Biblioteca;
import java.time.LocalDate;

class Emprestimo{
    private Livro livro_emprestado;
    private Usuario usuario_emprestando;
    private int id_emprestimo;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(int id_emprestimo, Usuario usuario, Livro livro, LocalDate dataEmprestimo, LocalDate dataDevolucao){
        this.id_emprestimo = id_emprestimo;
        this.usuario_emprestando = usuario;
        this.livro_emprestado = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }

    public Emprestimo(Livro a, Usuario b){
        this.livro_emprestado = a;
        this.usuario_emprestando = b;
        IO.println("Emprestimo realizado com sucesso!");
    }

    public void getEmprestimo(){
        IO.println("Livro emprestado: " + livro_emprestado.getTitulo());
        IO.println("Usuario que realizou o emprestimo: " + usuario_emprestando.getNome());
    }

}