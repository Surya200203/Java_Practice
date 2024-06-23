package PatternQuestions;

class Pattren19{
    public void p19(int n){
        for(int i = 0; i < n; i ++){

            // spaces
            for(int j = 0; j < n-i-1; j ++){
                System.out.print(" ");
            }

            //characters
            char ch = 'A';
            int breakpoint = (2*i+1)/2;
            for(int j = 1; j <= 2*i +1 ; j++){
                System.out.print(ch);
                if(j <= breakpoint){
                    ch = (char)((int)ch+1);
                }else{
                    ch = (char)((int)ch-1);
                }

            }


            //spaces
            for(int j = 0; j < n-i-1; j++){
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}

public class Question19 {
    public static void main(String[] args) {
        Pattren19 p = new Pattren19();
        p.p19(4);

    }
}
