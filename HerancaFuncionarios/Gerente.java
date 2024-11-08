package HerancaFuncionarios;


import HerancaFuncionarios.Funcionario;

public class Gerente extends Funcionario {

    private String departamento;

    public Gerente(String nome, int idade, String sexo, int matricula, double salario, int tempoServico , String departamento) {
    super(nome, idade, sexo, matricula, salario, tempoServico);
    this.departamento = departamento;
    }

//    public Gerente(Funcionario funcionario, String departamento){
//        super(getNome(), getIdade(), getSexo(), getMatricula(), getSalario(), getTempoServico());
//    this.departamento = departamento;
//    }
    protected void exibirDadosGerente() {
        System.out.println("-------------------------------------");
        System.out.println("Nome: "+ getNome());
        System.out.println("Idade: "+ getIdade());
        System.out.println("Sexo: "+ getSexo());
        System.out.println("Matricula: "+ getMatricula());
        System.out.println("Salario com Bonus: " + salarioFinal());
        System.out.println("Tempo de servico: "+ getTempoServico());
        System.out.println("Bonus por cargo: "+ bonus());
        System.out.println("Departamento: "+ departamento);
    }

    public double bonus() {
        return((getSalario()*0.1)* getTempoServico() );
    }

    public double salarioFinal()  {
        return(getSalario() + bonus());
    }
}
