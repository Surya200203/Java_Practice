package PatternQuestions;
/*

****
****
****
****
 */

class Pattern3{

    public void show(int n ){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
public class Question3 {

    public static void main(String[] args) {

        Pattern3 pt = new Pattern3();
        pt.show(4);
    }
}
