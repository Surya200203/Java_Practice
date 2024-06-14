package OOP.Inheritance.MethodOverriding;

public class Clac{

    public int add(int n1, int n2){
        return n1+n2;
    }

    public int sub(int n1,int n2){
        return n1-n2;
    }
}

class AdvCalc extends Clac{

    public int add(int n1, int n2){
        return n1+n2+1;
    }
}

public class Demo {
    public static void main(String[] args) {

        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(2,3);   // this add is called from B , add() in B overides add() in A.
        int r2 = obj.sub(3,2);   // this sub is called from A.
        System.out.println(r1 +" : "+r2 );


    }
}
