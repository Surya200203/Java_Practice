package PatternQuestions;

public class Question3 {

    public static void main(String[] args) {

        for(int i = 1 ; i <= 9; i=i+2){
            for(int j = 5-i ; j >=1 ; j--){
                System.out.print(" ");
            }
            for (int k = 1;k <= i ;k++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
