package SistemaBanco2;


import java.time.LocalDate;

public class Cliente {

    private String nome;

    private String dataNascimento;

    public Cliente(String nome , String dataDeNascimento) {
        this.nome = nome;        
        this.dataNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
}
