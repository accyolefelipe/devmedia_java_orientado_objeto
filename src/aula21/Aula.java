package aula21;

import aula20.Adicao;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Aula {

    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Ana", "Maria", "Ricardo" , "Bia" , "Aline");

        //teste01();
        //teste02();
        //teste03(nomes);
        teste04(nomes);

    }

    private static void teste04(List<String> nomes) {
        for(String nome: nomes){
            if (nome.startsWith("M")){
                System.out.println(nome);
            }
        }
        System.out.println("----------------");

        nomes.stream()
                .filter((String nome) -> nome.startsWith("M"))
                .forEach(System.out::println);

        System.out.println("----------------");

        Consumer<String> mensagem = (String s) -> System.out.print("O nome é ");

        Consumer<String> nome = (String n) -> System.out.println(n);

        nomes.forEach(mensagem.andThen(nome));
    }

    private static void teste03(List<String> nomes){
        for (String nome: nomes){
            System.out.println(nome);
        }
        System.out.println("----------------");

        nomes.forEach((nome) -> {
            System.out.println(nome);
        });

        System.out.println("----------------");

        nomes.forEach(System.out::println);


    }

    private static void teste01(){
        Funcionario f1 = new Funcionario() {
            @Override
            public double remuneracao() {

                return 800 + 900;
            }
        };
        System.out.println(f1.remuneracao());

        System.out.println("----------------------");

        Funcionario f2 = () -> { return 800 + 900;};
        f2.imprime();
    }

    private static void teste02(){
        Adicao ad = (a , b) -> { return a + b;};
        System.out.println("soma = " + ad.somar(800 , 900));
    }
}
