package SistemaBanco2;


import java.time.LocalDate;

public class Conta {

    private Cliente cliente;

    int numConta;

    double saldo;
    
  
    public Conta (Cliente cliente, int numConta , double saldo ){
        this.cliente = cliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }
    
    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Valor indisponível para saque! Dinheiro em saldo: " + saldo);
        } else {
            saldo -= valor;
            System.out.println("Saque efetuado com sucesso. Saldo atual: " + saldo);
        }
    }

    public void depositar(int i) {
    if(i <= 0){
        System.out.println("Valor insdispoonivel para deposito");
    }else if( i > 0){
        saldo +=i;
        System.out.println("Deposito efetuado com sucesso . Saldo atual: "+ saldo);
    }
    }

    public void exibirSaldo() {
        System.out.println("------------------------");
        System.out.println("Nome: " + cliente.getNome()); 
        System.out.println("N* conta: " + numConta );
        System.out.println("Saldo: " + saldo + " R$");
        System.out.println("------------------------");
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int NumConta) {
        this.numConta = NumConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
    
    
}
