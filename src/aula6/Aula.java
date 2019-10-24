package aula6;

import aula5.ClassB;

public class Aula extends ClassB {

    public static void main(String args[]){
        classA a = new classA();
        a.pacote = "Pacote a";
        a.protegido = "Protegido a";
        a.publico = "Publico a";

        ClassB b = new ClassB();
        b.publico = "Publico b";

        Aula aula = new Aula();
        aula.publico = "Publico";
        aula.protegido = "Protegido de b por herança";

        ClassD d = new ClassD();
        d.metodoD();
    }
}
