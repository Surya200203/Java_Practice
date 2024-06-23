package PatternQuestions;

class Pattern15{
    public void p15(int n){
        int start = 1;
        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i ; j++){
                System.out.print(start+" ");
                start++;
            }
            System.out.println();
        }
    }
}

public class Question15 {
    public static void main(String[] args) {
        Pattern15 p = new Pattern15();
        p.p15(5);
    }
}
