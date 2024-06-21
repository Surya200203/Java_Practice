package Interfaces;

interface A{

    // in interface variables are static and final
    int age = 22;
    String area = "Pune";

    void show();
    void config();

}

interface X{
    void run();
}

interface Y extends X{

}

class B implements A,Y{

    public void config() {
        System.out.println("in config");
    }

    public void show(){
        System.out.println("in show");
    }

    public void run(){
        System.out.println("in run");
    }

}

public class Demo {

    public static void main(String[] args) {
        A obj2;
        obj2 = new B();
        obj2.show();
        obj2.config();

        X obj;
        obj = new B();
        obj.run();

        Y obj3 = new B();
        obj3.run();

        System.out.println(A.age);
        System.out.println(A.area);
    }
}
