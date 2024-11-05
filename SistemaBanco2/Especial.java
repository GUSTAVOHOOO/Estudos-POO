package SistemaBanco2;


import java.time.LocalDate;

public class Especial extends Conta {

    protected double limite;

    public Especial (Cliente cliente, int numConta , double saldo, double limite){
        super(cliente, numConta, saldo);
        this.limite = limite;
    }

    public void saqueEspecial(double valor) {
        if (saldo - valor >= -limite) {
            saldo -= valor;
            System.out.println("Saque especial efetuado com sucesso. Valor: " + valor);
        } else {
            System.out.println("Saque negado! Limite especial insuficiente.");
        }
    }
   

    

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

  
    
}
