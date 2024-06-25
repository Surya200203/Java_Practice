package Threads.MultipleThreads;

class AAA implements Runnable {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
        }

    }
}

class BBB implements Runnable {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }
}
public class RunnableVsThread {
    public static void main(String[] args) {
        Runnable a = new AAA();
        Runnable b = new BBB();

        Thread t1 = new Thread(a);
        Thread t2 = new Thread(b);


        t1.start();
        t2.start();
    }
}
