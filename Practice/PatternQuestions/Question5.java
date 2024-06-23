package PatternQuestions;

class Pattren5{

    public void show(int n){
        for(int i = 1 ; i<= n;i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

public class Question5 {

    public static void main(String[] args) {
        Pattren5 pt = new Pattren5();
        pt.show(5);
    }
}
