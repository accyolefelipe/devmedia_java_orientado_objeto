package aula16;

public class MyClass extends Aula {

    void imprime(){

        System.out.println("Vindo da Classe MyClass");
        System.out.println("Referenciado");
        System.out.println(Aula.nome + " " + new Aula().sobrenome);

        Aula.Show();

        new Aula().Imprime();
    }
    static void Show(){
        System.out.println("MethodeStatic Show()");
        System.out.println(Aula.nome + " " + new Aula().sobrenome);
    }
}
