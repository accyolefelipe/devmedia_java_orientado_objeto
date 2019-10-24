package aula12;

public abstract class Funcionario {

    public abstract double calculaSalario();

    private String nome;
    private double Salario;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }
}
