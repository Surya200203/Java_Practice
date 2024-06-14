package OOP.AccessModifiers;

import OOP.AccessModifiers.other.A;


class C extends A{
    public void abc(){
        System.out.println(score);
    }
}


public class Demo {
    public static void main(String[] args) {
        A obj = new A();
        obj.setMarks(3);
        int marks = obj.getMarks();
        System.out.println("Marks present is class A is - "+marks);

        B obj2 = new B();
        System.out.println(obj2.marks);


    }
}

/*

                                    Public      Private     Protected       Default
Same Class                            Y            Y            Y              Y

Same package subclass                 Y            N            Y              Y

Same package non-subclass             Y            N            Y              Y

Different package subclass            Y            N            Y              N

Different packagr non-subclass        Y            N            N              N
 */

/*

Note :-
        1. Make your classes public
        2. Can't have two public classes in same file.
        3. Try to keep your instance variable private.
        4. Most of the time methods will pe public.
 */
