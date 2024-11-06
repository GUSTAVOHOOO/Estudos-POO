package HerancaFuncionarios;

public class Funcionario extends Pessoa {

    private int matricula;

    private double salario;

    private int tempoServico;

    public Funcionario(String nome, int idade, String sexo, int matricula, double salario, int tempoServico) {
    super(nome, idade, sexo);
    this.matricula = matricula;
    this.salario = salario;
    this.tempoServico = tempoServico; 
     }

    protected void exibirDadosFuncionario() {
        System.out.println("Nome: "+ getNome());
        System.out.println("Idade: "+ getIdade());
        System.out.println("Sexo: "+ getSexo());
        System.out.println("Matricula: "+ matricula);
        System.out.println("Salario: " + salario);
        System.out.println("Tempo de servico: "+ tempoServico);
        System.out.println("-------------------------------------");
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getTempoServico() {
        return tempoServico;
    }

    public void setTempoServico(int tempoServico) {
        this.tempoServico = tempoServico;
    }




}
