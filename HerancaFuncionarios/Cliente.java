package HerancaFuncionarios;

public class Cliente extends Pessoa {

    private double renda;

    private double valorDivida;

    public Cliente(String nome, int idade, String sexo, double renda, double valorDivida) {
    super(nome, idade, sexo);
    this.renda = renda;
    this.valorDivida = valorDivida;
    
   }

    protected void exibirDados() {
        
        exibirDadosPessoa();       
        System.out.println("Renda: "+ renda);
        System.out.println("Valor da Divida"+ valorDivida);
    
    }

    public double getRenda() {
        return renda;
    }

    public void setRenda(double renda) {
        this.renda = renda;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }




}

