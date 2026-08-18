public class Livro{
    //variaveis de instancia
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int estoque;
    private String operador;

    //construtor
    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;

    }

    //set
    public setEstoque(int estoque, String operador){
        if(operador != "Maria"){
            throw IllegalArgumentException("Operador nao pode alterar o Estoque");
        }
        else if(Estoque < 0) throw IllegalArgumentException("Idade permitida >= 10");    
        else this.estoque = estoque;
    }
    
    //get

    //is

    //metodos
    public void apagarLivro(String titulo){
        this.titulo = titulo;
    }

    public static void main(String[] args) {
        Livro a = new Livro("O Segredo");
        Livro b = new Livro("Senhor dos Aneis", "Joao", 2004);
    }

    //visibilidade: private - package - public - protected
}