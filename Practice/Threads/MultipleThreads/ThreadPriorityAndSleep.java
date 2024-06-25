package Threads.MultipleThreads;

class AA extends Thread{

    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class BB extends Thread{

    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }
}

public class ThreadPriorityAndSleep {
    public static void main(String[] args) {
        AA a = new AA();
        BB b = new BB();
        a.start();
        b.start();
    }
}
