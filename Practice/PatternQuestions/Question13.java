package PatternQuestions;

class Pattern13{

    public void p13(int n){
        int start = 1;
        for(int i=1 ; i<=n ; i++){
            start = (i%2==0)?0:1;
            for(int j = 1 ; j <= i; j ++){
                System.out.print(start+" ");
                start = 1-start;
            }
            System.out.println();
        }
    }
}


class Question13{
    public static void main(String[] args) {
        Pattern13 p = new Pattern13();
        p.p13(5);
    }
}
