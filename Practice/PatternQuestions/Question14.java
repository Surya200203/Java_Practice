package PatternQuestions;

class Pattern14{
    public void p14(int n){
        int start=2*n-2;
        for(int i = 1; i <= n; i ++){
            //numbers
            for(int j = 1; j<=i; j ++){
                System.out.print(j);
            }

            //space
            for(int j = start; j >=1; j--){
                System.out.print(" ");

            }

            // numbers
            for(int j =i ; j>=1 ; j--){
                System.out.print(j);
            }

            start = start -2;
            System.out.println();
       }
    }
}

public class Question14 {
    public static void main(String[] args) {
        Pattern14 p = new Pattern14();
        p.p14(5);
    }
}
