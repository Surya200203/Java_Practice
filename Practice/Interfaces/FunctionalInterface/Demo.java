package Interfaces.FunctionalInterface;

@FunctionalInterface
interface A{
    void run();
}

public class Demo {
    public static void main(String[] args) {
        A obj = new A()
        {
          public void run(){
              System.out.println("Running...");
          }
        };
        obj.run();
    }
}
