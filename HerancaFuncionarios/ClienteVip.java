package HerancaFuncionarios;


import HerancaFuncionarios.Cliente;

public class ClienteVip extends Cliente {

    private double bonus;
    
    
    public ClienteVip( String nome, int idade, String sexo, double renda, double valorDivida, double bonus) {
    
       super(nome, idade, sexo, renda, valorDivida);
       this.bonus = bonus;
    }

    public double parcelar() {
       
        return(getValorDivida() / bonus);
         
    }

    void exibirDadosClienteVip() {
        System.out.println("-------------------------------------");
        System.out.println("Nome: "+ getNome());
        System.out.println("Idade: "+ getIdade());
        System.out.println("Sexo: "+ getSexo());
        System.out.println("Renda: "+ getRenda());
        System.out.println("Valor da Divida: "+ getValorDivida());
        System.out.println("Valor por parcela: "+ parcelar());
        System.out.println("Bonus liberado: "+ bonus);
    }
}
