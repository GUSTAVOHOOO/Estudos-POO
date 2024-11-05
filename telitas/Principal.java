package telitas;

import java.util.Scanner;

public class Principal {

	 public static void main(String[] args) {
	       
		    Scanner scan = new Scanner(System.in);
		    Funcaotele tela1 = new Funcaotele(10, 0, true);
		    
		        System.out.println("Preparado para assistir uma TV?");
		      
		        
		        while(true){
		            tela1.mostrarStatus();
		            
		            tela1.menu();
		            String a = scan.nextLine();
		            
		            switch(a){
		                case "v+":
		                    System.out.println("Volum desejado: ");
		                    int i = scan.nextInt();
		                    tela1.aumentarVolume(i);
		                    break;
		                case"v-":
		                    System.out.println("Volum desejado: ");
		                    int y = scan.nextInt();
		                    tela1.diminuirVolume(y);
		                    break;
		                case"c+":
		                    System.out.println("Canal desejado: ");
		                    int u = scan.nextInt();
		                    tela1.aumentarVolume(u);
		                    break;    
		                 case"c-":
		                    System.out.println("Canal desejado: ");
		                    int o = scan.nextInt();
		                    tela1.descerCanal(o);
		                     break;
		                case"off":
		                    tela1.desligarTv();
		                    break;    
		                case"on":
		                    tela1.ligarTv();
		                    break;
		                case"sair":
		                   System.out.println("Ate a proxima.....");
		                	return ;    
		                
		             
		            
		            
		            
		            }
		            
		        
		        
		        
		        
		        
		        
		        
		        }
		        
		    
		    }
		    
		}

	
	

