package Banco1;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[]args) {
		
		
		Conta conta1 = new Conta(10000);
		Conta conta2 = new Conta("Poupanca", 20000);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bem vindo ao banco deseja acessar qual conta? 1 ou 2 \n");
		int num = scanner.nextInt();
		
		if(num == 1) {
			conta1.mostraConta();
			
		System.out.println("Para proceguir digite 1 para parar 0");
			int num2 = scanner.nextInt();
		    
			while(num2 != 0) {	
			
			conta1.menuBanco();
			
			switch(scanner.nextInt()) {
			
			case 1:
				System.out.println("\nDigite o valor para o deposito: ");
			double num3 = scanner.nextDouble();
			conta1.depositar(num3);
			break;
			
			case 2: 
				System.out.println("\nQuanto deseja sacar: ");
			double num4 = scanner.nextDouble();
			conta1.sacar(num4);
			break;
			
			case 3: 
				System.out.println("\nQuanto deseja transferir: ");
			double num5 = scanner.nextDouble();
			conta1.transferir(num5);
			break;
			default:
				
				return;
			}
		}
		
		
		}else if (num == 2){
			
			conta2.mostraConta();
			System.out.println("Para proceguir digite 1 para parar 0");
			int num2 = scanner.nextInt();
		    
			while(num2 != 0) {	
			
			conta2.menuBanco();
			
			switch(scanner.nextInt()) {
			
			case 1:
				System.out.println("\nDigite o valor para o deposito: ");
			double num3 = scanner.nextDouble();
			conta2.depositar(num3);
			break;
			
			case 2: 
				System.out.println("\nQuanto deseja sacar: ");
			double num4 = scanner.nextDouble();
			conta2.sacar(num4);
			break;
			
			case 3: 
				System.out.println("\nQuanto deseja transferir: ");
			double num5 = scanner.nextDouble();
			conta2.transferir(num5);
			break;
			default:
				
				return;
			}
		}
		
		}
		
}
}
