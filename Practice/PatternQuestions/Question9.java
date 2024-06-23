package PatternQuestions;

class Pattern9{
    public void pp(int n){
        for(int i=0; i< n ; i++){
            for(int j = 0 ; j< n-i-1;j++){
                System.out.print(" ");
            }

            for(int k=0 ; k < (2*i)+1 ; k++){
                System.out.print("*");
            }

            for(int j = 0 ; j< n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}

public class Question9 {
    public static void main(String[] args) {
        Pattern9 p = new Pattern9();
        p.pp(5);
    }
}
