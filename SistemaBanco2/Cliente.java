package SistemaBanco2;


import java.time.LocalDate;

public class Cliente {

    private String nome;

    private LocalDate dataNascimento;

    public Cliente(String nome , LocalDate dataDeNascimento) {
        this.nome = nome;        
        this.dataNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    
}
