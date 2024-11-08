package Alunosmediapck;

public class Aluno {
	
	    private String nome;
	    private double nota1;
	    private double nota2;
	    private double media;

	    public Aluno(String nome, double nota1, double nota2) {
	        this.nome = nome;
	        this.nota1 = nota1;
	        this.nota2 = nota2;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public double getNota1() {
	        return nota1;
	    }

	    public double getNota2() {
	        return nota2;
	    }

	    public double getMedia() {
	        return media;
	    }

	    public void setMedia(double media) {
	        this.media = media;
	    }

	    public void exibirNotas() {
	        System.out.println("Notas de " + nome + ": " + nota1 + ", " + nota2);
	    }

	    public void exibirMedia() {
	        System.out.println("Média de " + nome + ": " + media);
	    }

	    public void exibirAprovado() {
	        if (media >= 7) {
	            System.out.println(nome + " foi aprovado.");
	        } else {
	            System.out.println(nome + " foi reprovado.");
	        }
	    }
	}

