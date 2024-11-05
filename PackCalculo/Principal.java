package PackCalculo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
        
	       
        System.out.println("\nDigite um numero: ");
        double num1 = scanner.nextDouble();
        
        System.out.println("\nDigite outro numero: ");
        double num2 = scanner.nextFloat();
        
         Calcular cal = new Calcular(num1, num2);
        
       
        String escolha = scanner.nextLine();
        	while(escolha != "0") {
        		cal.menu();
        
        	switch(scanner.nextLine()){
        	
        	case "+": 
        		System.out.println("\n"+cal.soma(num1, num2));
        		break;
        	case "-":
        		System.out.println("\n"+cal.subtracao(num1, num2));
        		break;
        	case "*" :
        		System.out.println("\n"+cal.multiplicacao(num1, num2));
        		break;
        	case "/":
        		System.out.println("\n"+cal.divisao(num1, num2));
        		break;
        	default:
        		System.out.println("\nEscolha invalida.....");
        		break;
        	case "0":
        		return;
        	}
        	}

	
	
	
	
	
	
	
	
	
	}

}
