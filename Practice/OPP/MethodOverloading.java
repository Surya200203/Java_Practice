package OPP;

<<<<<<< HEAD
class Calculator1{
=======
class Calculator{
>>>>>>> e30030934f350f5e7c648027d432b630513f235c

    public int add(int num1, int num2){
        return num1+num2;
    }

    public double add(double num1, int num2){
        return num1+num2;
    }

    public int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }
}

public class MethodOverloading {

    public static void main(String[] args){

<<<<<<< HEAD
        Calculator1 obj1 = new Calculator1();
=======
        Calculator obj1 = new Calculator();
>>>>>>> e30030934f350f5e7c648027d432b630513f235c

        int res1 = obj1.add(2, 3);
        int res2 = obj1.add(1, 2, 3);
        double res3 = obj1.add(2.56, 3);

        System.out.println("Addition of 2 and 3 is "+res1);
        System.out.println("Addition of 1,2 and 3 is "+res2);
        System.out.println("Addition of 2.56 and 3 is "+res3);
    }
    
}


