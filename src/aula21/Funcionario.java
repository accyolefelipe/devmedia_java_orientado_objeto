package aula21;

@FunctionalInterface
public interface Funcionario {

        double remuneracao();

        default void imprime(){
            System.out.println(remuneracao()
            );
        }

}
