/*Questão 2 – Classes abstratas e polimorfismo (2,0 pontos)
Uma empresa precisa desenvolver um sistema para calcular o salário de seus funcionários. Existem dois tipos de funcionários: mensalistas e horistas.

Implemente as classes considerando as seguintes regras:
- Crie uma classe abstrata Funcionario, contendo os atributos nome e CPF.
- A classe Funcionario deve possuir um construtor para inicializar seus atributos.
- Implemente um método abstrato calcularSalario(), que retorna o salário do funcionário.
- Crie a classe FuncionarioMensalista, que herda de Funcionario e possui o atributo salarioFixo.
- Crie a classe FuncionarioHorista, que herda de Funcionario e possui os atributos valorHora e horasTrabalhadas.
- A classe FuncionarioMensalista deve implementar calcularSalario(), retornando o salário fixo.
- A classe FuncionarioHorista deve implementar calcularSalario(), multiplicando o valor da hora pela quantidade de horas trabalhadas.
Crie uma classe DemoFuncionario, com método void main(), que instancie diferentes tipos de funcionários e armazene-os em um arranjo do tipo Funcionario[].

Percorra o arranjo utilizando um laço de repetição e apresente o nome e o salário de cada funcionário, utilizando o método calcularSalario().

Objetivo: Aplicar classes abstratas, métodos abstratos, herança e polimorfismo.*/

package II_Unidade_Revisao.Questao2;

public class DemoFuncionario{

    public static void main(String[] args) {

        Funcionario[] funcionario = new Funcionario[2];

        funcionario[0] = new FuncionarioHorista("Vitor", "12345678910", 10.5, 40);
        funcionario[1]= new FuncionarioMensalista("João", "98765432101", 3280.76);

        for(int i=0; i<2; i++){
            System.out.println("Salário de " + funcionario[i].getNome() + ": R$ " + funcionario[i].calcularSalario());
        }


    }

}