package aula20;

public class myClass {

    public static void main(String[] args) {

        Calcular c = new Calcular();

        System.out.println("soma: " + c.somar(2,4));

        System.out.println("produto: " + c.multiplicar(2,4));

        myClass a = new myClass();

        System.out.println("soma: " + a.mySoma(8,5));

        //classe anonima de argumento

        a.imprime(new Executa() {
            @Override
            public void executar() {

                System.out.println("felipe seu lindo");
            }
        });

    }

    void imprime(Executa executa){
        executa.executar();
    }
        //classe anonima comum
    int mySoma(int x, int y){

        Adicao adicao = new Adicao() {
            @Override
            public int somar(int a, int b) {
                return b + a;
            }
        };

        return adicao.somar(x, y);
    }
}
