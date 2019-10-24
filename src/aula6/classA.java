package aula6;

public class classA {
    private String privado;
    protected String protegido;
    public String publico;
    String pacote;

    public static void main(String args[]){
        classA a = new classA();
        a.pacote = "Pacote a";
        a.protegido = "Protegido a";
        a.publico = "Publico a";
        a.privado = "Privado a";
    }

}
