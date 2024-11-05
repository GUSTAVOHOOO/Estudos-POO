package Banco1;

public class Conta {

	private String tipo = "Corrente";
	private double saldo;
	
	public Conta(double saldo) {
		this.saldo = saldo;
	}
	public Conta(String tipo , double saldo) {
		this.tipo = tipo;
		this.saldo = saldo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	void mostraConta() {
		System.out.println("Conta: "+ tipo);
		System.out.println("Slado: "+ saldo);
	}
	
	void menuBanco() {
		System.out.println("\nSe deseja prossegui escolha umas das acoes abaixo ");
		System.out.println("""
		Depositar : 1		
		Sacar : 2
		Transferir : 3
		Sair do programa : 4		""");
	}
	
	
	
	
	public boolean depositar(double valor) {
		if(valor >= 0) {
			saldo += valor;
		mostraConta();
		return true;
		}else {
			System.out.println("Voce esta tentando depositar um valor nulo!!!");
		return false;
		}
	}
		
		
	public boolean sacar(double valor) {
		if(saldo >= valor) {
			saldo -= valor;
		mostraConta();
		return true;
		}else {
			System.out.println("Voce nao tem dinheiro sufucuente para sacar");
		return false;
		}
	}
	
	
	public boolean transferir (double valor) {
			if(valor <= saldo) {
				saldo -= valor;
				mostraConta();
				return true;
			}else{
				System.out.println("Valor invalido para transferencia");
				return false;
		}
	}
		
	
	
	
	
	
	
}	
		
				
		
		

