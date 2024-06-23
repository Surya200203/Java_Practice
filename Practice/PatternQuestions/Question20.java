package PatternQuestions;

class Pattern20{

    public void p20(int n){

        for(int i = 0 ; i < n; i ++){
            char ch = 'E';
            for(int j = i; j >=0; j--){
                ch = (char)((int)ch-j);
                System.out.print(ch+" ");
                ch = 'E';
            }
            System.out.println();
        }
    }
}


public class Question20 {
    public static void main(String[] args) {
        Pattern20 p = new Pattern20();
        p.p20(5);
    }
}
