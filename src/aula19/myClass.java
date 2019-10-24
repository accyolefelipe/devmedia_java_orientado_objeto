package aula19;

public class myClass {

    private int a;

    private static int valor = 1000;

    private static class myStaticClass{

        private int valor;

        public  myStaticClass(){
            this.valor = valor;
        }

        public void imprime(){
            System.out.println(valor);
        }
    }

    public static void main(String[] args) {
        int a = myClass.valor;

        myStaticClass m = new  myClass.myStaticClass();
            m.imprime();

    }
}
