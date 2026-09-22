/*
Q3 — Referências
Sem executar, escreva o que será impresso e depois confira:
Livro a = new Livro();
a.titulo = "Clean Code";
Livro b = a;
Livro c = new Livro();
c.titulo = "Clean Code";
b.emprestar();
IO.println(a.emprestado);
IO.println(b.emprestado);
IO.println(c.emprestado);
IO.println(a == b);
IO.println(a == c);
*/

class Livro{
    String titulo;
    Boolean emprestado = false;

    void emprestar(){
        emprestado = true;
    }
}
void main(){
    Livro a = new Livro();
    a.titulo = "Clean Code";
    Livro b = a;
    Livro c = new Livro();
    c.titulo = "Clean Code";
    b.emprestar();
    IO.println(a.emprestado);
    IO.println(b.emprestado);
    IO.println(c.emprestado);
    IO.println(a == b);
    IO.println(a == c);
}
    
