package aula13;

public class Aula {

    private Veiculo veiculo;
    private Carro carro;
    private Moto moto;


    void carros(){
        carro = new Ford();
        carro.setCor("Branco");
        carro.setPeso(8000);
        System.out.println(carro.toString());

    }

    void motos(){
        moto = new Honda();
        moto.setCor("Cinza");
       moto.setPeso(800);
       moto.setNome("Titan 600");
        System.out.println(moto.toString() + ", " + moto.getNome());
    }

    void veiculos(){

        veiculo = new Ford();
        veiculo.setCor("Verde");
        veiculo.setPeso(8000);
        System.out.println(veiculo.toString());

        veiculo = new Honda();
        veiculo.setCor("Azul");
        veiculo.setPeso(800);
        System.out.println(veiculo.toString());
    }

    public static void main(String[] args) {
        new Aula().veiculos();
        new Aula().carros();
        new Aula().motos();

        Ford f = new Ford();
        f.setCor("Vermelha");
        f.setPeso(60000);
        System.out.println(f.toString());

        Honda h = new Honda();
        h.setCor("Preta");
        h.setPeso(400);
        h.setNome("Fazer 250");
        System.out.println(h.toString() + " , " + h.getNome());
    }
}
