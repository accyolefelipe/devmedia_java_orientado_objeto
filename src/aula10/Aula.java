package aula10;

import java.time.LocalDate;

public class Aula {

    public static void main(String args[]){
        Aluno a1 = new Aluno();
        a1.setDataNasc(LocalDate.of(1991,02,07));
        a1.setNome("Felipe");
        a1.setSobrenome("Accyole");
        a1.setSexo('M');
        a1.setTurno(Turno.MANHA);
        System.out.println(a1.toString());

        Aluno a2 = new Aluno("Jose","Haji",LocalDate.of(2009,11,05),'M',Turno.MADRUGADA);
        System.out.println(a2.toString());

        Professor p1 = new Professor();
        p1.setDataNasc(LocalDate.of(1968,05,07));
        p1.setNome("Gilmar");
        p1.setSobrenome("Gil");
        p1.setSexo('M');
        p1.setHoras(Horas.TRINTA_HORAS);
        System.out.println(p1.toString());

        Professor p2 = new Professor("Jose","Haji",LocalDate.of(2009,11,05),'M',Horas.VINTE_HORAS);
        System.out.println(p2.toString());

    }
}
