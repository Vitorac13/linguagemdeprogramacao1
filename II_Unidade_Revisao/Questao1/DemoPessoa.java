/*Questão 1 – Herança (2,0 pontos)
Implemente as classes Pessoa e Aluno, considerando as seguintes regras:
- A classe Pessoa deve possuir os atributos nome e CPF.
- A classe Aluno deve herdar de Pessoa e possuir o atributo matrícula.
- Os atributos devem ser encapsulados, utilizando modificadores de acesso adequados.
- Ambas as classes devem possuir construtores que permitam inicializar seus atributos.
- A classe Pessoa deve disponibilizar um método exibirDados(), responsável por apresentar o nome e o CPF.
- A classe Aluno deve sobrescrever o método exibirDados(), apresentando também a matrícula.
Crie uma classe DemoPessoa, com método void main(), responsável por instanciar objetos das classes Pessoa e Aluno e testar os métodos implementados.

Objetivo: Aplicar herança, reutilização de atributos e métodos e sobrescrita de métodos (@Override).*/

package II_Unidade_Revisao.Questao1;

public class DemoPessoa{
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Vitor", "12345678910");
        Aluno aluno = new Aluno("Joao", "98765432101", "999999");
        pessoa.exibirDados();
        aluno.exibirDados();
    }
}