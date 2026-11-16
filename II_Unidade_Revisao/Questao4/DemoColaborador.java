/*Questão 4 – Herança, classes abstratas, interfaces e polimorfismo (2,0 pontos)
Uma instituição de ensino deseja desenvolver um sistema para calcular a remuneração de seus colaboradores. Existem professores e funcionários administrativos.

Implemente as classes considerando as seguintes regras:
- Crie uma interface Bonificavel, contendo o método calcularBonus(), que retorna um valor do tipo double.
- Crie uma classe abstrata Colaborador, contendo os atributos nome e salarioBase.
- A classe Colaborador deve possuir um construtor para inicializar seus atributos e um método calcularRemuneracao(), que retorna o salário-base acrescido do bônus.
- Crie a classe Professor, que herda de Colaborador e implementa Bonificavel. O professor deve possuir o atributo quantidadeTurmas. Seu bônus corresponde a 5% do salário-base por turma.
- Crie a classe FuncionarioAdministrativo, que herda de Colaborador e implementa Bonificavel. Seu bônus corresponde a 10% do salário-base.
Crie uma classe DemoColaborador, com método void main(), que:
1. Instancie professores e funcionários administrativos.
2. Armazene os objetos em um arranjo do tipo Colaborador[].
3. Percorra o arranjo e apresente o nome, o salário-base, o bônus e a remuneração total de cada colaborador.
Objetivo: Integrar herança, classes abstratas, interfaces e polimorfismo em uma única aplicação.*/

package II_Unidade_Revisao.Questao4;

public class DemoColaborador{

    public static void main(String[] args) {

        Colaborador[] colaboradores = new Colaborador[5];

        colaboradores[0] = new Professor("Vitor", 3536.90, 5);
        colaboradores[1] = new FuncionarioAdministrativo("Joao", 2543.54);

        //colaboradores[0].calcularRemuneracao();
        //colaboradores[1].calcularRemuneracao();

        for (int i = 0; i < 2; i++) {

            System.out.println("Nome: " + colaboradores[i].getNome());

            System.out.println("Salário-base: R$ "
                + colaboradores[i].getSalarioBase());

            System.out.println("Bônus: R$ "
                + colaboradores[i].calcularBonus());

            System.out.println("Remuneração total: R$ "
                + colaboradores[i].calcularRemuneracao());

            System.out.println("-------------------------");
        } 
    }

}