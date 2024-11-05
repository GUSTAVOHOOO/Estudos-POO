package PackCalculo;

public class Calcular {
    
    
    private final double num1;
    private final double num2;

   
 
  
    public Calcular ( double num1 , double num2  ){
        this.num1 = num1 ;
        this.num2 = num2 ;
        }
    
    double soma(double num1, double num2){
        
        return num1 + num2;
    }
    
    double subtracao(double num1 , double num2){
        
      return num1 - num2;  
    }
    
    
    double multiplicacao(double num1 , double num2){
        return num1 * num2;
        
    }
    
    double divisao(double num1 , double num2){
        return num1 / num2;
        
    }
    
    void menu () {
    	System.out.println("""
    	        
    	        Que tipo de operacao voce deseja fazer? (escolha um dos caracteres abaixo):
    	        
    	        Soma '+'
    	        Subtracao '-'
    	        Multiplicacao '*'
    	        Divisao '/' 
    	        Sair do programa '0'""");
    }
    
    
    	


}

