package OOP.AnonymousObject;

class A{

    public A(){
        System.out.println("object created");
    }

    public void show(){
        System.out.println("in A show() ");
    }

}

public class Anonymous {
    public static void main(String[] args) {
        new A().show();   // Anonymous Object

    }

    /*
    OUTPUT

    in A show()
     */


}
