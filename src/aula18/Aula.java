package aula18;

import java.time.LocalDate;

public class Aula {

    public static void main(String[] args) {



        Pessoa p = new Pessoa();
        p.setNome("Felipe");
        p.setSobrenome("Accyole");
        p.setDtNascimento(LocalDate.of(1991, 02 ,07));

        System.out.printf("%s %s tem %d anos %d meses %d  e dias" ,p.getNome(), p.getSobrenome(), p.getIdade().getAnos(), p.getIdade().getMeses(), p.getIdade().getDias());


    }
}
