package PatternQuestions;

class Pattern7{

    public void s(int n){
        for(int i = n ; i >= 1 ; i--){
            for(int j = 1; j <=i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


public class Question7 {

    public static void main(String[] args) {
        Pattern7 p = new Pattern7();
        p.s(5);
    }
}
