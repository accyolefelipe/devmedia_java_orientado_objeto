package aula15;

public class Pessoa {

    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa(String nome) {
        this.nome = nome;
        System.out.println("Construtor Pessoa()");
    }

    public Pessoa(){
        System.out.println("Construtor Pessoa()");



    }


}
