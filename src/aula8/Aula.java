package aula8;

public class Aula {
    public static void main(String args[]) {

        Livro l1 = new Livro();
        l1.setTitulo("java");
        l1.setAutor("João");
        l1.setPaginas(50);
        l1.setLancamento(false);
        System.out.println(l1.toString());

        Livro l2 = new Livro("Java 2", "Jose",89, true);
        System.out.println(l2.toString());


    }
}
