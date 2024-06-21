package Interfaces.FunctionalInterface.LambdaExpression;

@FunctionalInterface
interface B{
    void show(int a);
}

public class LEWithParameter {
    public static void main(String[] args) {
        B obj = a -> System.out.println("in show "+ a);

        obj.show(4);
    }
}
