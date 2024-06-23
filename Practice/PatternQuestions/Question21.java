package PatternQuestions;

class Pattern{

    public void rp21(int n){

        for(int i = 1; i <= n; i++){

            //star
            for(int j = 1; j <= i; j++ ){
                System.out.print("*");
            }

            //spaces
            for(int j = 1; j <= 2*(n-i); j++ ){
                System.out.print(" ");
            }

            //star
            for(int l = 1; l <= i; l++){
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public void sp21(int n){

        for(int i =0; i < n; i++){

            //star
            for(int j = n-i; j>0; j--){
                System.out.print("*");
            }

            //space
            for(int j=1; j <= 2*(n-(n-i)); j++){
                System.out.print(" ");
            }

            //star
            for(int j = n-i; j>0; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

public class Question21 {
    public static void main(String[] args) {
        Pattern p = new Pattern();
        p.sp21(5);
        p.rp21(5);
    }
}
