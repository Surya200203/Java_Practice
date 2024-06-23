package Exceptions;


class A {
    public void show() throws ClassNotFoundException{
        Class.forName("Calc");
    }
}
public class throwsKeyword {
    public static void main(String[] args)  {

        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println(e);;
        }
    }
}
