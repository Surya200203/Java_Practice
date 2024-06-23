package PatternQuestions;

class Pattern22{

    public void sp22(int n){
            for(int i = 0; i < n-1; i++){
                //star
                for(int j = n-i-1; j >=1 ; j--){
                    System.out.print("*");
                }

                //space
                for(int j = 0; j <= 2*i+1 ; j++){
                    System.out.print(" ");
                }

                //star
                for(int j = n-i-1; j >=1 ; j--){
                    System.out.print("*");
                }
                System.out.println();
            }
    }
}

public class Question22 {
    public static void main(String[] args) {
        Pattern p = new Pattern();
        Pattern22 p2 = new Pattern22();
        p.rp21(5);
        p2.sp22(5);

    }
}
