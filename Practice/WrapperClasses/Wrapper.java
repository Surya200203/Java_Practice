package WrapperClasses;

public class Wrapper {
    public static void main(String[] args) {
        int num4 = 9;
        Integer num = num4;    // autoboxing
        System.out.println(num);

        int num2 = num;
        System.out.println(num2); // auto-unboxing
    }
}
