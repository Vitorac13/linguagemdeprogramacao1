package br.edu.ifba.conquista.lp1.exercicio2;

public class Inscricao {
    private String nomeAluno;
    private double media;
    public boolean possuiTurma;

    public Inscricao(String nomeAluno, double media){
        this.nomeAluno = nomeAluno;
        this.media = media;
    }

    public double getMedia(){
        return media;
    }
    public String getNomeALuno(){
        return nomeAluno;
    }

    public void consultaDadosEstudante(){
        System.out.println("Nome: " + nomeAluno);
        System.out.println("Media: " + media);
    }


}
