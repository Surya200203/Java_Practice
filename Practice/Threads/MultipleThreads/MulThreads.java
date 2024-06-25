package Threads.MultipleThreads;

class A extends Thread{

    public void run(){
        for(int i = 0; i < 50; i++){
            System.out.println("Hi");
        }
    }
}

class B extends Thread{

    public void run(){
        for(int j = 0; j < 50 ; j++){
            System.out.println("Hello");
        }
    }
}

public class MulThreads {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.start();
        b.start();
    }

}
