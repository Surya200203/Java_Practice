package PatternQuestions;

class Pattern17{

    public void p17(int n){
        for(int i = 1; i <= n; i ++){
            int ascii_start = 65;
            for(int j = n; j >= i ; j--){
                char s = (char) ascii_start;
                System.out.print(s);
                ascii_start++;
            }
            System.out.println();
        }
    }
}
public class Question17 {
    public static void main(String[] args) {
        Pattern17 p =new Pattern17();
        p.p17(5);
    }
}
