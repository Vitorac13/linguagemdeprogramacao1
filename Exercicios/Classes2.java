/*
Q2 — Dois Objetos, Dois Estados
Utilize a classe Livro apresentada em aula. Crie dois objetos Livro.
Empreste somente o primeiro. Imprima descricao() dos dois objetos e
explique, em um comentário, por que o segundo continua disponível.
*/

class Livro{
    String titulo;
    String autor;
    Boolean emprestado = false;

    Livro(String titulo){
        this.titulo = titulo;
        emprestado = false;
    }

    void emprestar(){

    }

    String descricao(){
        return (emprestado)? titulo + " está emprestado.": titulo + " está disponível.";
    }
}

void main(){
    Livro livro1 = new Livro("Rei dos anéis");
    Livro livro2 = new Livro("Harry Potter");

    livro1.emprestado = true;
    IO.println(livro1.descricao());
    IO.println();
    IO.println(livro2.descricao());
}