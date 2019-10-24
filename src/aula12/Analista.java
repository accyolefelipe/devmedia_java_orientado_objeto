package aula12;

public class Analista extends Funcionario {

    public double calculaSalario(){
        return (getSalario() * 0.40) + getSalario();


    }
}
