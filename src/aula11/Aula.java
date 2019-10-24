package aula11;

public class Aula {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Felipe");
        a1.setMatricula("1234");
        System.out.println("Nome: " + a1.getNome() + " | Matricula: " + a1.getMatricula());


        Professor p1 = new Professor();
        p1.setNome("Jesus");
        p1.setMatricula("1234");
        System.out.println("Nome: " + p1.getNome() + " | Matricula: " + p1.getMatricula());
    }}
