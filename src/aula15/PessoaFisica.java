package aula15;

public class PessoaFisica extends Pessoa {

    public PessoaFisica(){
        System.out.println("Construtor PessoaFisica()");

    }

    public PessoaFisica(String nome){
        super(nome);
        System.out.println("Construtor PessoaFisica(String nome)");

    }
}
