package aula11;

public class Professor extends Pessoa {

    public void setMatricula(String matricula) {
        if (matricula.length() == 8) {
            super.setMatricula(matricula);
        } else {
            super.setMatricula("Matricula Invalida");
        }

    }
}
