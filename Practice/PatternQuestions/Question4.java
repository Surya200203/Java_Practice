package PatternQuestions;

class Pattren4{

    public void showP(int n){
        for(int i = 1 ; i<= n;i++){
            for(int j = 1 ; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Question4 {

    public static void main(String[] args) {
        Pattren4 pt = new Pattren4();
        pt.showP(50);
    }
}
