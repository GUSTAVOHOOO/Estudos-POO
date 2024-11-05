package Alunonitos;

import java.util.HashMap;

public class Alunos {

	private String nome;
	private double n1;
	private double n2;
	private Medias medias;
	private HashMap<String, Alunos> provas = new HashMap<>();
	
	
	public Alunos (String nome, double n1, double n2) {
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
		
	}
	
	public Alunos() {
			
		}
	
	public void adicionarAluno(String nome , Alunos aluno) {
		provas.put(nome,aluno);
		}
	
	public Alunos(Medias medias) {
		this.medias = new Medias(this);
	}
	
	
	
	void exibirNota() {
		for(Alunos alunoos : provas.values()) {
			System.out.println(alunoos);
		}
	}
	void exibirMedia() {
		for(Alunos alunoos : provas.values()) {
			medias = new Medias(alunoos);
			System.out.println("Medias do alunos: " + alunoos.getNome());
			System.out.println("Media simples: "+ medias.mediaSimples());
			System.out.println("Media ponderada: "+ medias.mediaPonderada());
			System.out.println("Media geometrica: "+ medias.mediaGeometrica());
		}
	}
	void exibirAprovados() {
		for(Alunos alunoos : provas.values()) {
			medias = new Medias(alunoos);
			if(medias.mediaSimples() >= 6 && medias.mediaPonderada() > 6) {
			System.out.println("Aluno: "+ alunoos.getNome() + " APROVADO" );
		}else {
			System.out.println("Aluno: " + alunoos.getNome() + " REPROVADO");
		}
	}
	}

	public String getNome() {
		return nome;
	}

	public double getN1() {
		return n1;
	}

	public double getN2() {
		return n2;
	}

	public Medias getMedia() {
		return medias;
	}

	
    @Override
    public String toString() {
        return "Nome: " + nome + ", Nota 1: " + n1 + ", Nota 2: " + n2;
    }
	

	
	
	}
	
	

