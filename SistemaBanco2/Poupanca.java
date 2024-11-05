package SistemaBanco2;


import java.time.LocalDate;

public class Poupanca extends Conta {

    private int diasDeRendimento;

    public Poupanca(  Cliente cliente, int numConta , double saldo ,int diasDeRendimento) {
        super(cliente, numConta, saldo);
        this.diasDeRendimento = diasDeRendimento;   
        
    }

    public void calcularNovoSaldo(double taxaRendimento ) {
            saldo = saldo* Math.pow(1 + taxaRendimento, diasDeRendimento);
    }

    public int getDiasDeRendimento() {
        return diasDeRendimento;
    }

    public void setDiasDeRendimento(int diasDeRendimento) {
        this.diasDeRendimento = diasDeRendimento;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    
  
}
