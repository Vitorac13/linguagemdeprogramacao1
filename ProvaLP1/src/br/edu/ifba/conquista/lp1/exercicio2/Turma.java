package br.edu.ifba.conquista.lp1.exercicio2;

public class Turma {
    private String codigo;
    private Inscricao[] inscricoes;
    private int quantidadeInscricoes = 0;

    public Turma(){
        this.inscricoes = new Inscricao[40];
        quantidadeInscricoes++;
    }
    public void matricular(Inscricao inscricao){
        if(inscricao.possuiTurma == true){
            System.out.println("Este aluno já possui uma turma");
            return;
        }

        else if(quantidadeInscricoes < 40){
            this.inscricoes[quantidadeInscricoes] = inscricao;
            inscricao.possuiTurma = true;
        }
        else System.out.println("O limite de inscrições da turma foi atingido");
    }
    public double mediaDaTurma(){
        double somaNotaTurma = 0;
        for(int i=0; i<quantidadeInscricoes; i++){
            somaNotaTurma += inscricoes[i].getMedia();
        }
        return somaNotaTurma / quantidadeInscricoes;
    }
    public void listarAlunos(){
        if(quantidadeInscricoes > 0) {
            System.out.println("Alunos da Turma: ");
            for (int i=0; i < quantidadeInscricoes; i++) {
                if(inscricoes!=null) {
                    System.out.print(inscricoes[i].getNomeALuno() + " teve média: " + inscricoes[i].getMedia());
                }
            }
        } else{
            System.out.println("Esta tumra não tem inscrições");
            return;
        }
    }

}
