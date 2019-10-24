package aula11;

public class Aluno extends Pessoa {

    public void setMatricula(String matricula) {
        if(matricula.length() == 4) {
            super.setMatricula(matricula);
        }
        else{
            System.out.println("Matricula Invalida para o Aluno: " + getNome());
        }

    }

}
