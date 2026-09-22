package br.edu.ifba.conquista.lp1.exercicio2;

public class Main{
    public static void main(String[] args) {

        Turma turmaA = new Turma();
        Turma turmaB = new Turma();

        Inscricao insc1 = new Inscricao("Vitor" , 10);
        Inscricao insc2 = new Inscricao("Joao" , 8);
        Inscricao insc3 = new Inscricao("Ivo" , 7.5432432);

        turmaA.matricular(insc1);
        turmaA.matricular(insc2);
        turmaB.matricular(insc2);
        turmaB.matricular(insc3);

        turmaA.listarAlunos();
        turmaB.listarAlunos();

        System.out.println(turmaA.mediaDaTurma());

    }
}