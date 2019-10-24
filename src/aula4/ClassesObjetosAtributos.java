package aula4;

public class ClassesObjetosAtributos {
    int x = 1;
    String y = "ola";
    String z = "Mundo";

    int soma(int a, int b){
        return a + b;
    }

    int sub(int a, int b){
        return a - b;
    }

    public static void main(String args[]){
        ClassesObjetosAtributos a = new ClassesObjetosAtributos();
        int x2 = a.x + 2;

        System.out.println("Valor de x: " + a.x);
        System.out.println("Valor de x2: " + x2);

        System.out.println(a.y + " " + a.z);

        int soma = a.soma(7,8);
        int sub = a.sub(5,2);
        System.out.println("Resuldado: " + soma);
        System.out.println("Resuldado: " + sub);

        for (int i = 0; i < 5; i++){
            System.out.println(a.soma(x2, i));
        }

    }

}
