package Alunonitos;

import java.util.Scanner;

public class Main {

	public static void main(String[]args) {
	
		Alunos alunos = new Alunos();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("Digite o nome do aluno para o cadastro (Digite 'sair' para fechar o programa)");
			String nome = scan.nextLine();
			
			if(nome.equalsIgnoreCase("sair")) {
				break;
			}else {
				System.out.println("Digite a nota da P1: ");
				double p1 = scan.nextDouble();
				System.out.println("Digite a nota da P2: ");
				double p2 = scan.nextDouble();
				scan.nextLine();
				
				Alunos alu = new Alunos(nome, p1,p2);
				alunos.adicionarAluno(nome, alu);
				
			}
		}
		
		System.out.println("----- Notas -----");
		alunos.exibirNota();
		System.out.println("----- Medias -----");
		alunos.exibirMedia();
		System.out.println("----- Aprovados/Reprovados -----");
		alunos.exibirAprovados();
		
		
		
	}
}
