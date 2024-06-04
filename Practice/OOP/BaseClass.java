package OOP;

class Calculator{

    int a;

    public int add(int num1, int num2){
        
        return num1+num2;
    }
}


public class BaseClass {
    
    
    public static void main(String[] args) {
        
        int num1 = 2;
        int num2 = 3;

        // creating object

        Calculator obj = new Calculator();

        int result = obj.add(num1,num2);
        System.out.println("Addition of "+num1+" and "+num2+" is "+result);


    }
}
