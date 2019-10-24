package aula4;

public class ExercicioAula4 {
    void tabuada (int x){
        for(int i = 0; i <= 10; i++){
            System.out.println(i + "*" + x + "=" + i*x);

        }

    }
    public static void main(String args[]){
        ExercicioAula4 a = new ExercicioAula4();
        a.tabuada(2);
    }

}
