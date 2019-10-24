package aula12;

public class Programador extends Funcionario {

    public double calculaSalario(){
        return (getSalario() * 0.25) + getSalario();

    }


}
