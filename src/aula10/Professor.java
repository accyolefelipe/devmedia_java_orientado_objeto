package aula10;


import java.time.LocalDate;

public class Professor extends Pessoa{

    private Horas horas;

    public Professor(){
        super();
    }

    public Professor(String nome, String sobrenome, LocalDate dataNasc, char sexo, Horas horas) {
        super(nome, sobrenome, dataNasc, sexo);
        this.horas = horas;
    }


    public Horas getHoras(){
        return horas;
    }
    public void setHoras(Horas horas){
        this.horas = horas;
    }

    @Override
    public String toString() {
        return super.toString() +
                "horas=" + horas +
                "| ";
    }
}
