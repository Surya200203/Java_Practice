package OOP.SuperAndThisMethod.SuperMethod;
/*

When we have constructor in B class only it will work and gives output "in B" , when we create an object of B

Now if we have constructor of A as well, and we create object of B , it first calls constructor of A and then of B, but we have not created object of A, so haow it is called.

Note :- Every constructor in java has method super() -->means call the constructor of super class
Note :- Every class in java extends the Object class
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

class B extends A{
    public B(){
        super(2);
        System.out.println("in B");
    }

    public B(int n){
        super(n);
        System.out.println("in B int");
    }
}


public class Demo {
    public static void main(String[] args) {
        System.out.println("Calling Parameterized Constructor of B");
        B obj = new B(2);
        System.out.println("Calling Default Constructor of B");
        B obj2 = new B();
        System.out.println("Calling Default Constructor of A");
        A obj3 = new A();

    }
}
