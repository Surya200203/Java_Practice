package FinalKeyword;


final class Clac{
    public void show(){
        System.out.println("in Calc Show");
    }
    public void add(int a , int b){
        System.out.println(a+b);
    }
}

class AvdCalc extends Clac{

}

public class Demo {
    public static void main(String[] args) {
        final int num = 8 ;  // we can't change the value
        
        Clac obj = new Clac();
        obj.show();
        obj.add(2,2);
    }
}
