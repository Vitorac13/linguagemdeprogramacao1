class Pessoa{
    String nome;
    int idade;

    String apresentar(){
        return nome + " (" + idade + " anos)";
    }
}

void main(){
    Pessoa p1 = new Pessoa();
    p1.nome = "Joao";
    p1.idade = 20;

    IO.println(p1.apresentar());

}