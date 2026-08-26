public class Livro{
    private int id_livro;
    private String titulo;
    private String autor;
    private int anoLancamento;
    private String genero;
    private String editora;
    private int quantidade;

    public Livro(int id_livro, String titulo, String autor, int anoLancamento, String editora,String genero, int quantidade){
        this.id_livro = id_livro;
        this.titulo = titulo;
        this.autor = autor;
        this.anoLancamento = anoLancamento;
        this.editora = editora;
        this.genero = genero;
        this.quantidade++;
    }    
}