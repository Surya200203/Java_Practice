package PatternQuestions;

class Pattren6{

    public void show(int n){
        for(int i = 1 ; i<= n;i++){
            for(int j = 1 ; j <= i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

public class Question6 {

    public static void main(String[] args) {
        Pattren6 pt = new Pattren6();
        pt.show(5);
    }
}
