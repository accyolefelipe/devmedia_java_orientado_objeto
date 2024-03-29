package aula10;

import java.time.LocalDate;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private LocalDate dataNasc;
    private char sexo;

    public Pessoa(){

    }

    public Pessoa(String nome, String sobrenome, LocalDate dataNasc, char sexo){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
        this.sexo = sexo;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                "| sobrenome='" + sobrenome + '\'' +
                "| dataNasc=" + dataNasc +
                "| sexo=" + sexo +
                "| ";
    }
}
