package AbstractKeyword;

abstract class Car{
    public abstract void drive();
    public abstract void fly();
    public void playMusic(){
        System.out.println("play music");
    }

}

class BMW extends Car{
    public void drive(){
        System.out.println("driving...");
    }

    public void fly(){
        System.out.println("Flying...");
    }
}

public class Abs {
    public static void main(String[] args) {
        Car obj = new BMW();
        obj.drive();
        obj.playMusic();
        obj.fly();
    }
}

/*
Note :-
1. abstract method should be in abstract class
2. An abstract class can have abstract and normal methods
3. We can't create an object of abstract class

 */