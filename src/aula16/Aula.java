package aula16;

public class Aula {

    static String nome = "Felipe";

    String sobrenome = "Accyole";

    void Imprime(){
        System.out.println("Methode Imprime()");
        System.out.println(nome + " " + sobrenome);

    }

    static void Show(){
        System.out.println("MethodeStatic Show()");
        System.out.println(nome + " " + new Aula().sobrenome);
    }

    public static void main(String[] args) {
        new Aula().Imprime();
        Show();

        System.out.println("Referenciado");
        System.out.println(nome + " " + new Aula().sobrenome);

        System.out.println("Apartir de Objeto");
        Aula a1 = new Aula();
        System.out.println(nome + " " + a1.sobrenome);



        new MyClass().imprime();

        MyClass my = new MyClass();
        my.imprime();

        MyClass.Show();

        Aula a2 = new Aula();
        a2.sobrenome = "Lacerda";
        a2.nome = "Gerard";
        System.out.println(nome + " " + a2.sobrenome);

        Aula a3 = new Aula();
        a3.sobrenome = "Da Lua";
        System.out.println(nome + " " + a3.sobrenome);



    }

}
