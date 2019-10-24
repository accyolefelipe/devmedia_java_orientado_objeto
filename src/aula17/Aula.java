package aula17;

public class Aula {

    static int vStatic = 1;
    int vInstance = 1;

    static{
        System.out.println("Bloco Estatico");
        System.out.println(vStatic);
        System.out.println(new Aula().vInstance);

    }

    {
        System.out.println("Bloco de Instancia");
        System.out.println(vStatic + vInstance);
        vInstance = 8;
    }

    public Aula(){
        System.out.println("New Aula");
        this.vInstance = 9;
    }

    public static void main(String[] args) {
        Aula a1 = new Aula();
        a1.vInstance = 5;
        System.out.println(a1.vInstance);
    }


}
