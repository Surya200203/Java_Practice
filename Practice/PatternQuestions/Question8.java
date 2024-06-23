package PatternQuestions;


class Pattern8{

    public void pattern(int n ){
        for(int i = n ; i >= 1 ; i--){
            for(int j = 1; j <= i ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}

public class Question8 {
    public static void main(String[] args) {

        Pattern8 p = new Pattern8();
        p.pattern(5);
    }
}
