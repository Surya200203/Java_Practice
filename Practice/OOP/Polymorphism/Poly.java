package OOP.Polymorphism;


class A {

    public A(){
        System.out.println("Constructor of A");
    }
    public void show(){
        System.out.println("in A show");
    }

    public void a(){
        System.out.println("a method of A");
    }
}

class B extends A{

    public B(){
        System.out.println("Constructor of B");
    }


    public void show(){
        System.out.println("in B show");
    }
}

class C extends A{
    public C(){
        System.out.println("Constructor of C");
    }

    public void show(){
        System.out.println("in C show");
    }
}


public class Poly {
    public static void main(String[] args) {
        A obj = new A();
        obj.show();


        obj = new B();
        obj.show();
//
        obj = new C();
        obj.show();
//
        obj.a();
    }
}
