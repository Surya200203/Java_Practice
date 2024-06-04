package OOP.SuperAndThisMethod.ThisMethod;

/*
    this()  --> Executes the constructor of same class
*/
class A  {
    public A(){
        super();
        System.out.println("in A");
    }

    public A(int n){
        super();
        System.out.println("in A int");
    }
}

class B extends A {
    public B(){
        super();
        System.out.println("in B");
    }

    public B(int n){
        this();
        System.out.println("in B int");
    }
}


public class Demo {
    public static void main(String[] args) {
        System.out.println("Calling ParamDefaulteterized Constructor of B");
        B obj = new B(2);

    /*
        OUTPUT

        in A
        in B
        in B int

    */
    }
}
