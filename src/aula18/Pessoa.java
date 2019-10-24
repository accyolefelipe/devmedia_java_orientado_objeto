package aula18;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {

    private String nome;

    private String sobrenome;

    private LocalDate dtNascimento;




    public CalculaIdade getIdade(){
        return  new Idade();
    }

    public class Idade implements CalculaIdade{
        @Override
        public int getAnos() {
            Period periodo = Period.between(dtNascimento, LocalDate.now());
            return periodo.getYears();
        }

        @Override
        public int getMeses() {
            Period periodo = Period.between(dtNascimento, LocalDate.now());
            return periodo.getMonths();

        }

        @Override
        public int getDias() {
            Period periodo = Period.between(dtNascimento, LocalDate.now());
            return periodo.getDays();
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }
}
