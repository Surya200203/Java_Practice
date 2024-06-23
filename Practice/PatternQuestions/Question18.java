package PatternQuestions;
class Pattern18{
    public void p18(int n){
        int ascii_start = 65;
        for(int i = 1; i <= n; i ++){
            for(int j = 1; j <= i ; j++){
                char s = (char) ascii_start;
                System.out.print(s);
            }
            ascii_start++;
            System.out.println();
        }
    }
}
public class Question18 {
    public static void main(String[] args) {
        Pattern18 p = new Pattern18();
        p.p18(5);



    }
}
