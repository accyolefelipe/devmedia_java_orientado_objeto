package aula7;

public class Aula {

    public static void main(String args[]){
        Pessoa p1 = new Pessoa();
        p1.setNome("Maria");
        p1.setIdade(65);


        System.out.println(p1.getNome() + " - " + p1.getIdade());

        Pessoa p2 = new Pessoa();
        p2.setNome("João");
        p2.setIdade(-65);


        System.out.println(p2.getNome() + " - " + p2.getIdade());

    }

}
