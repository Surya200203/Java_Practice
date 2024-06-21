package Interfaces.FunctionalInterface.LambdaExpression;

import org.w3c.dom.ls.LSOutput;

@FunctionalInterface
interface K{
    int add(int a, int b);
}

public class LEWithReturn {

    public static void main(String[] args) {
        K obj = (a, b) ->  a + b ;



        int result = obj.add(3,2);
        System.out.println(result);
    }
}
