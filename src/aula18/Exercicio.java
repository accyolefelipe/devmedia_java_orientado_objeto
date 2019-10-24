package aula18;

public class Exercicio {



    private class MyInnerClass {
        public void hello(){
        System.out.println("Ola sou uma classe interna regular");
        }


    }

    public static  void main(String args[]){

        MyInnerClass my = new Exercicio(). new MyInnerClass();
        my.hello();






    }

}


