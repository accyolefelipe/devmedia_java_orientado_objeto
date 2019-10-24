package aula9;

public class Aula {

    public static final String OURO = "ouro";
    public static final String PAUS = "paus";
    public static final String ESPADAS ="espadas";
    public static final String COPAS = "copas";



    public static void main(String[] args) {
        TrueOrFalse t = TrueOrFalse.FALSE;
        System.out.println(t);
        System.out.println(t.getDesc());
        System.out.println(t.getIndex());

        for (TrueOrFalse t2 : TrueOrFalse.values()){
            System.out.println(t2);
            System.out.println(t.getDesc());
            System.out.println(t.getIndex());


        }

        Carta carta = Carta.ESPADAS;
        switch (carta) {
            case OURO:
                System.out.println("Carta de Ouro");
                break;
            case PAUS:
                System.out.println("Carta de Paus");
                break;
            case ESPADAS:
                System.out.println("Carta de Espadas");
                break;
            case COPAS:
                System.out.println("Carta de Copas");
                break;
            default:
                System.out.println("Nenhum Naipe");
                break;
        }

        String naipe = Aula.COPAS;
        switch (naipe){
            case Aula.OURO:
                System.out.println("Carta de Ouro");
                break;
            case Aula.PAUS:
                System.out.println("Carta de Paus");
                break;
            case Aula.ESPADAS:
                System.out.println("Carta de Espadas");
                break;
            case Aula.COPAS:
                System.out.println("Carta de Copas");
                break;
            default:
                System.out.println("Nenhum Naipe");
                break;



        }
    }

}
