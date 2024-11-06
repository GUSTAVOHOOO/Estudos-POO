package HerancaFuncionarios;


import HerancaFuncionarios.Funcionario;

public class Vendedor extends Funcionario {

    private String tipoProduto;

    private double valorVenda;

    public Vendedor(String nome, int idade, String sexo, int matricula, double salario, int tempoServico, String tipoProduto, double valorVenda) {
        super(nome, idade, sexo, matricula, salario, tempoServico);
        this.tipoProduto = tipoProduto;
        this.valorVenda = valorVenda;
    }

    protected void exibirDadosVendedor() {
        System.out.println("-------------------------------------");
        System.out.println("Nome: "+ getNome());
        System.out.println("Idade: "+ getIdade());
        System.out.println("Sexo: "+ getSexo());
        System.out.println("Matricula: "+ getMatricula());
        System.out.println("Salario com Bonus: " + salarioFinal1());
        System.out.println("Tempo de servico: "+ getTempoServico());
        System.out.println("Produto vendido: "+ tipoProduto);
        System.out.println("Valor da venda realizada: " + valorVenda);
        System.out.println("-------------------------------------");
    }

    public double salarioFinal1() {
        return((valorVenda*0.2)+ getSalario());
    }
}
