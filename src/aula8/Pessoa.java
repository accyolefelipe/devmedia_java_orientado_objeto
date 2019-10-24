package aula8;

public class Pessoa {
    private String nome;
    private String sobrenome;
    private char sexo;
    private int idade;

    public Pessoa(){

    }

    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(int idade){
        this.idade = idade;
    }

    public Pessoa(String nome, String sobrenome, char sexo, int idade) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.sexo = sexo;
        this.idade = idade;
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

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
