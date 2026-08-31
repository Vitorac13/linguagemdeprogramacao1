package Biblioteca;

public class Biblioteca{
    public static void main(String[] args){

        Livro rev = new Livro("Revolucao");
        Usuario joao = new Usuario("Joao");
        IO.println(rev.getTitulo());
        Emprestimo b = new Emprestimo(rev, joao);
        b.getEmprestimo();

    }
}