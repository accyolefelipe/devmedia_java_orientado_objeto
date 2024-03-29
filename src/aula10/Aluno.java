package aula10;


import java.time.LocalDate;

public class Aluno extends Pessoa  {

    private Turno turno;

    public Aluno(){
        super();

    };

    public Aluno(String nome, String sobrenome, LocalDate dataNasc, char sexo, Turno turno) {
        super(nome, sobrenome, dataNasc, sexo);
        this.turno = turno;
    }


    public Turno getTurno(){
        return turno;
    }

    public void setTurno(Turno turno){
        this.turno = turno;
    }

    @Override
    public String toString() {
        return super.toString() + "turno=" + turno +
                "| ";
    }
}
