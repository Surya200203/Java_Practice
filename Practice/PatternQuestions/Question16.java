package PatternQuestions;

class Pattern16{

    public void p16(int n){
        for(int i = 1; i <= n; i ++){
            int ascii_start = 65;
            for(int j = 1; j <= i ; j++){
                char s = (char) ascii_start;
                System.out.print(s);
                ascii_start++;
            }
            System.out.println();
        }
    }
}

public class Question16 {
    public static void main(String[] args) {
        Pattern16 p =new Pattern16();
        p.p16(5);
    }
}
