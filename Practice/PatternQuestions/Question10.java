package PatternQuestions;

class Pattern10{

    public void prinP(int n){
        for(int i = 0 ; i < n ; i++){

            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }

            for(int k = 0 ; k < 2*(n-i-1)+1 ; k++){
                System.out.print("*");
            }

            for(int j = 0 ; j < i ; j++){
                System.out.print(" ");
            }
            System.out.println();


        }
    }
}

public class Question10 {
    public static void main(String[] args) {

        Pattern10 p = new Pattern10();
        p.prinP(5);
    }
}
