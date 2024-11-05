package Alunonitos;

public class Medias {

	public Alunos aluno;
	
	public Medias (Alunos aluno) {
		this.aluno = aluno;
	}
	
	public double mediaSimples() {
		return(aluno.getN1()+aluno.getN2())/2;
	}
	public double mediaPonderada() {
		double peso1 = 0.6;
		double peso2 = 0.4;
	return((aluno.getN1()* peso1) + (aluno.getN2() * peso2)/ (peso1 + peso2));
	
	}
	public double mediaGeometrica() {
		return Math.sqrt(aluno.getN1() * aluno.getN2());
		
	}


}
