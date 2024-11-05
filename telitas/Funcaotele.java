package telitas;

public class Funcaotele {
	 public int getCanal() {
	        return canal;
	    }

	    public void setCanal(int canal) {
	        this.canal = canal;
	    }

	    public int getVolume() {
	        return volume;
	    }

	    public void setVolume(int volume) {
	        this.volume = volume;
	    }

	    public boolean isLigado() {
	        return ligado;
	    }

	    public void setLigado(boolean ligado) {
	        this.ligado = ligado;
	    }
	    private int canal;
	    private int volume = 0;
	    private boolean ligado ;
	   
	    
	    public Funcaotele(int canal, int volume, boolean ligado){
	        this.canal = canal;
	        this.ligado = ligado;
	        this.volume = volume;
	    }
	    
	    void aumentarVolume(int i){
	        if(i > 10){
	            System.out.println("O volume maximo da Televisao e 10");
	            volume += 10;
	        }else if (i > 0){
	            volume += i;
	        }else{
	            System.out.println("Valor invalido");
	        }
	    }
	    void diminuirVolume(int i){
	        if(i == volume){
	            volume = 0 ;
	        }else if (i < volume){
	            volume -= i;
	        }else if (i > volume){
	        volume = 0;
	        }
	            
	    }
	    
	    
	    void subirCanal(int i ){
	       canal += i;
	    }
	    void descerCanal(int i){
	        if(i < 0){
	            canal -= i;
	        }else{
	            System.out.println("Ja estamos no primeiro canal, nao e possivel descer mais");
	        }
	          
	    }

	    void ligarTv(){
	       ligado = true;
	       
	    }
	    void desligarTv(){
	      ligado = false;
	      
	   }   
	    
	    void mostrarStatus(){
	        System.out.println("------------------------------");
	        System.out.println("Volume atual da TV: "+ volume);
	        System.out.println("Canal atual: "+ canal);
	        
	        if(ligado){
	            System.out.println("Televisao Ligada");
	        }else if(!ligado){
	            System.out.println("Televisao Desligada");    
	        }
	        System.out.println("------------------------------");
	    }

	    void menu(){
	        System.out.println("""
	        		 Aumentar volume: v+
	                 Diminuir volume: v-
	                 Subir canal: c+
	                 Descer canal: c-
	                 Desligar tv: off
	                 Ligar tv: on
	                 Sair do programa: sair
	                 -----------------------------""");
	    }
	    
	    
	}

