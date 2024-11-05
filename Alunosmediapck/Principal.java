package Alunosmediapck;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Aluno> alunos = new HashMap<>();

        System.out.print("Quantos alunos deseja cadastrar? ");
        int quantidade = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o nome do aluno: ");
            String nome = scanner.nextLine();

            System.out.print("Digite a primeira nota: ");
            double nota1 = scanner.nextDouble();

            System.out.print("Digite a segunda nota: ");
            double nota2 = scanner.nextDouble();
            scanner.nextLine();

            Aluno aluno = new Aluno(nome, nota1, nota2);

            System.out.println("Escolha o tipo de media para " + nome + ":");
            System.out.println("1 - Media Simples");
            System.out.println("2 - Media Ponderada");
            System.out.println("3 - Media Geometrica");
            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            double media = 0;

            switch (opcao) {
                case 1:
                    media = Media.mediaSimples(nota1, nota2);
                    break;
                case 2:
                    System.out.print("Digite o peso da primeira prova: ");
                    double peso1 = scanner.nextDouble();
                    System.out.print("Digite o peso da segunda prova: ");
                    double peso2 = scanner.nextDouble();
                    scanner.nextLine(); 
                    media = Media.mediaPonderada(nota1, nota2, peso1, peso2);
                    break;
                case 3:
                    media = Media.mediaGeometrica(nota1, nota2);
                    break;
                default:
                    System.out.println("Opção invalida. Usando media simples por padrao.");
                    media = Media.mediaSimples(nota1, nota2);
                    break;
            }

            aluno.setMedia(media);
            alunos.put(nome, aluno);
        }

        System.out.println("\nResultados dos Alunos:");
        for (Map.Entry<String, Aluno> entry : alunos.entrySet()) {
            Aluno aluno = entry.getValue();
            aluno.exibirNotas();
            aluno.exibirMedia();
            aluno.exibirAprovado();
            System.out.println();
        }

        scanner.close();
    }
}
