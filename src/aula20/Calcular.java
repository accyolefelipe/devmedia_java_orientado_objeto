package aula20;

public class Calcular implements Adicao, Multiplicacao {


    @Override
    public int somar(int a, int b) {
        return a + b;
    }

    @Override
    public int multiplicar(int a, int b) {
        return a * b;
    }
}
