package Interfaces.FunctionalInterface.LambdaExpression;

@FunctionalInterface
interface A{
    void run();
}

public class SS {
    public static void main(String[] args) {

        //Lambda Expression
        A obj = () -> System.out.println("Running...");


        obj.run();
    }
}
