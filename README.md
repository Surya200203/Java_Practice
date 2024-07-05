# Java
Learning Java using project based learning technique

## JRE,JDK,JVM
- JDK (Java Development Kit)
- JRE (Java Runtime Environment)
- JVM (Java Virtual Machine)
 - JDK --> JRE --> JVM

## Variables
- Synatx :- DataType VariableName = value;
```java
    int num = 2;
```

## Data Type

- Types :
  - Primitve 
  - Non Primitive

- Primitive :
  - Integer --> byte, short, int long
  - Float --> double, float
  - Character 
  - Boolean 

- Integer
  - int --> 4 bytes
  - long --> 8 bytes
  - short --> 2 bytes
  - byte --> 1 byte  --> -128 to 127

- Float
  - float --> 4 bytes
  - double --> 8 bytes (default)

- Character
  - char --> 2 bytes (It has 2 bytes because it uses UNICODE)
  - Always use single quote

- Boolean 
  - It accepts true or false

## Type Converstion and Casting
- Casting : Explicit converstion
- Converstion : Implicit converstion
```java
int a = 12 ;
byte b  = (byte) a;

byte c = 127;
System.out.println(b);  // 127
int n = c; // n = 127

int d = 300;
byte g = (byte)d;   // 300 % 256 =  44
System.out.println("g :- "+g);

```
- Type promotion
```java

byte a = 30;
byte b = 10;

int result = a * b;
System.out.println(result);  // 300
```
Here the multiplication of a and b gives 300, which is out of range of byte. So, java promote it to int and we can store it in result.

## Arithmetic  Operator
- " + " --> Addition
- " - " --> Subtraction
- / --> Division (gives quotent)
- % --> Modulo (gives remainder)
- num++ --> Post Increment (assigns and then increment's the value)
- num-- --> Post Decrement (assigns and then decrement's the value)
- ++num --> Pre Increment (increment's and then assigns the value)
- --num --> Pre Decerement (decrement's and then assigns the value)

## Relational Operators
- < --> Less than
- " > " --> Greather than
- = --> Assignment opertor
- == --> Equals to
- <= --> Less than  Equal to
- " >= " --> Greater tha Equal to
- != --> Not equal to

## Logical Operator
- || --> OR
- && --> AND
- ! --> NOT

## Conditional Statements
- if-else
- if-else if - else if - else

## Ternary Operator
- condition ? if_ture_execute_this : if_false_execute_this


## Switch Statement
```java
int day = 1;
switch (day) {
    case 1:
        System.out.println("Monday");
        break;
    case 2:
        System.out.println("Tuesday");
        break;
    case 3:
        System.out.println("Wednesday");
        break;
    case 4:
        System.out.println("Thrusday");
        break;
    case 5:
        System.out.println("Friday");
        break;
    case 6:
        System.out.println("Saturday");
        break;
    case 7:
        System.out.println("Sunday");
        break;
    default:
        System.out.println("Not valid Input");
        break;
}
        
```

## Updated Switch Statement
```java
String week_day = "Sunday";
        
switch(week_day){
    case "Sunday","Saturday" -> System.out.println("6am");
    case "Monday" -> System.out.println("8am");
    default -> System.out.println("7am");
}
```
## Using switch as expression
```java
String week_day = "Sunday";
String result = "";        
result = switch(week_day){
    case "Sunday","Saturday" -> "6am";
    case "Monday" -> "8am";
    default -> "7am";
}

System.out.println(result);

//OR

String e = "Sunday";
String result = "";        
        
result = switch(e){
    case "Sunday","Saturday" : yield  "6am";
    case "Monday" : yield "8am";
    default : yield "7am";
};
        
System.out.println(result);
```
## Loops

## For Loop
```java
for(int i = 0 ; i < 5 ; i++){
    System.out.println("Hi"+ i);
}
```
## While Loop
```java
int counter = 0;
while (counter < 5) {
    System.out.println("Hi" + counter);
    counter++;
}
```
### Do While Loop
```java
int i =0;
do{
    System.out.prinln("Hi"+1);
    i++;
}while(i<5);

```

## OOP (Object Oriented Programming)
- Object --> Properties and Bheaviours
 ```java

    class Calculator{

      public int add(num1,num2){
        return num1 + num2;
     }
    }

    public class Main{

      public static void main(String[] args){
        
        int number1 = 2;
        int number2 = 3;

        Calculator c = new Calculator();
        int result = c.add(number1.number2);
        System.out.println(result); //5
     }
    }

 ```
- Methods in Java
```java

class Computer{

    public void PlayMusic(){
        System.out.println("Play some music...");
    }
    
    public String getMyPen(){
        return "Pen";
    }
}

public class Main{

    public static void main(String[] args){

        Computer music = new Computer();
        Computer pen = new Computer();

        music.PlayMusic();

        String myPen = pen.getMyPen();
    }
}

```

## Method Overloading
```java

class Calculator{

    public int add(int num1, int num2){
        return num1+num2;
    }

    public double add(double num1, int num2){
        return num1+num2;
    }

    public int add(int num1, int num2, int num3){
        return num1+num2+num3;
    }
}

public class MethodOverloading {

    public static void main(String[] args){

        Calculator obj1 = new Calculator();

        int res1 = obj1.add(2, 3);
        int res2 = obj1.add(1, 2, 3);
        double res3 = obj1.add(2.56, 3);

        System.out.println("Addition of 2 and 3 is "+res1);
        System.out.println("Addition of 1,2 and 3 is "+res2);
        System.out.println("Addition of 2.56 and 3 is "+res3);
    }
    
}
```
## Array

```java

    int num[] = {5,6,7};
    int num1[] = new int[4];  // Dynamically creates a array with all element as zeros [0,0,0,0]

    System.out.println(num[0]); // 5
    System.out.println(num[1]); // 6
    System.out.println(num[2]); // 7

    nums[1] = 3; // change value
```
## Multi Dimensional Arrray
```java

    int multiArray[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};

    // Printing an array

    for(int i = 0 ; i < multiArray.length ; i++){
        for(int j = 0; j < multiArray[0].length ; j++){
            System.out.print(multiArray[i][j] + " ");
        }
        System.out.println();

    }

    /* 
    Output

    1 2 3 
    4 5 6
    7 8 9
    */


    // Enhanced for loop
    
    for(int n[] : num){
        for(int m : n){
            System.out.print(m + " ");
        }
        System.out.println();
    }
<<<<<<< HEAD
```

## Jagged and 3D array

```java
    System.out.println();
    System.out.println("Jagged Array");
    int arr[][] = new int[3][];   // jagged array

    arr[0] = new int[3];// soecifying columns in jagged array
    arr[1] = new int[4];
    arr[2] = new int[2];

    for(int n=0 ; n < arr.length ; n++){
        for(int k = 0; k < arr[n].length ; k++){
            arr[n][k] = (int)(Math.random()*10);
        }
    }

    for(int n[] : arr){
        for(int m : n){
            System.out.print(m + " ");
        }
        System.out.println();
    }
```

## 3D Array
```java
    System.out.println();
    System.out.println("3D array");

    int num3[][][] = new int[4][4][4];

    for(int i =0 ; i < num3.length ; i++){
        for(int j = 0 ; j < num3[0].length ; j++){
            for(int k = 0 ; k < num3[0][0].length;k++){
                 num3[i][j][k] = (int)(Math.random()*10);
            }
        }
    }

```
## Array of Objects
```java

class Student{
    int rollNo;
    String name;
    int Standard;
    char section;
}

class ArrayOfObjects{
    public static void main(String[] args) {
        
        Student obj = new Student();
        obj.rollNo = 1;
        obj.name = "Rohan";
        obj.section = 'A';
        obj.Standard = 8;

        Student obj1 = new Student();
        obj1.rollNo = 2;
        obj1.name = "Sahil";
        obj1.section = 'A';
        obj1.Standard = 8;

        Student obj2 = new Student();
        obj2.rollNo = 3;
        obj2.name = "Manish";
        obj2.section = 'B';
        obj2.Standard = 9;
        
        
        int arr[] = {obj,obj1,obj2};

        System.out.println(arr[0].name);
        
    }
}

```
## Strings in Java

- Stream of characters
- String is a class
- use .charAt() to get character at given index.
- Strings are Immutable

```java

    String str = "Sahil";
            //OR
    String str2 = new String();
    
    System.out.println(str.charAt(1)); // a
```
- If need to use mutable strings we have two classes in Java
    1. String Builder
    2. String Buffer
- Stringbuffer gives a buffer size of 16 bytes
  ```java
    
    StringBuffer sb = new StringBuffer();  // Creating a string buffer
    System.out.println(sb.capacity());  // 16

    StringBuffer sb2 = new StringBuffer("Sanket");
    System.out.println(sb2.capacity());  // 22
            
    sb2.append(" Suryavanshi");
    System.out.println(sb2);    // "Sanket Suryavanshi"
    System.out.println(sb2.length());   // 18
    System.out.println(sb2.capacity()); // 22

    sb2.append(" is learning Java");
    System.out.println(sb2);    // "Sanket Suryavanshi is learning Java"
    System.out.println(sb2.length());   // 35
    System.out.println(sb2.capacity()); // 46
    
  ```
- Use .toString() method to convert StringBuffer to String
  ```java
    // To convert Stringbuffer to String
    String str =  sb2.toString();
    System.out.println(str);
    System.out.println(str.length()); //35
  ```
  
## Static Keyword in  Java

### Static Variable
- Static variable are shared among all objects as given in below example
  ```java
     
    class Mobile{
        String brand;
        int price;
        static String name;

        public void show(){
            System.out.println(brand + " -"+ price +" -"+name);
        }
    }

    public class StaticVarilable {

        public static void main(String[] args) {

            Mobile m = new Mobile();

            m.brand = "Apple";
            m.price = 120000;
            m.name = "Smart Phone";

            Mobile m2 = new Mobile();

            m2.brand = "Samsung";
            m2.price = 80000;
            m2.name = "Samrt Phone";

            m.name = "mobile";

            m.show();
            m2.show();
        
            /*
                OUTPUT
                Apple -120000 -mobile
                Samsung -80000 -mobile
            */

        }
    }

  ```
### Static Methods

- We can use static variables in static methods, but can't use non-variables in static method.
- Because static variables are assigned to all objects, and it gets confused which non-static variable to use when we use it in static method.
- So to access non-static variables we pass an object as parameter to static method.
  ```java
      class Mobile1{
          String brand;
          int price;
          static String name;

          public void show(){
              System.out.println(brand + " -"+ price +" -"+name);
          }

          public static void show1(Mobile1 obj){
              System.out.println(obj.brand + " -"+ obj.price +" -"+name);
          }
      }

      public class StaticMethod {

          public static void main(String[] args) {
              Mobile1 m = new Mobile1();
              m.brand = "Apple";
              m.price = 120000;
              Mobile1.name = "mobile";
              m.show();

              Mobile1 m2 = new Mobile1();
              m2.brand = "Samsung";
              m2.price = 80000;
              Mobile1.show1(m2);

              /*
                 OUTPUT

                 Apple -120000 -mobile
                 Samsung -80000 -mobile

              */

          }
      }

  ```
  

### Static Block
- We declare the static variable in static block and it is called once irespective of how many objects you make
- Static block is called first.
- Class loder in JVM loads a class once.
- The class dosen't load , if we do not create object.
- To load a class without creating an object, we can use class named "Class" and which has an object named .forName("Mobile"). 
- 
```java
  class Mobile{
    String brand;
    int price;
    static String name;
    
    static{
        name = "mobile-phone";
    }
    
    public Mobile(){
        brand = "";
        price = 200;
    }
    public show(){
        System.out.println(brand +" : "+ price+ " : "+name);
    }
}

public class Main(){
    public static void main(String[] args){
        
        Mobile m1 = new Mobile();
        m1.brand = "Apple";
        m1.price = 120000;
        m1.show();
        
        
    }
}
```

## Encapsulation in Java
- Binding the data and methods in class in known as Encapsualtion.
- Making the instance varibale privte make them only accessable in that respective class.
  ```java
  
  class Human
  {
    private String name;
    private int age;
    private String gender;
  
    public void setName(String n){
        name = n;
    } 
    
    public void setAge(int a){
        age = a;
    }
    
    public void setGender(String g){
        gender = g;
    }
  
    public void getDetails(){
        System.out.println("Name :- "+name);
        System.out.println("Age :- "+age);
        System.out.println("Gender :- ",gender);
    }
  }
  
  public class Main
  {
    public static void main(String [] args){
        //Creating an object of class Human
        Human obj = new Human();
        obj.setAge(22);
        obj.setName("Sanket");
        obj.setGender("male");
        obj.getDetails();
    } 
  }
  ```
## this Keyword
- Represents the current object.
 ```java
  
  class Human
  {
    private String name;
    private int age;
    private String gender;
  
    public void setName(String name){
        this.name = name;
    } 
    
    public void setAge(int age){
        this.age = age;
    }
     
    public void setGender(String gender){
        this.gender = gender;
    }
  
    public void getDetails(){
        System.out.println("Name :- "+name);
        System.out.println("Age :- "+age);
        System.out.println("Gender :- ",gender);
    }
  }
  
  public class Main
  {
    public static void main(String [] args){
        //Creating an object of class Human
        Human obj = new Human();
        obj.setAge(22);
        obj.setName("Sanket");
        obj.setGender("male");
        obj.getDetails();
    } 
  }
  ```

## Constructor
- Method that is invoked as object is created.
 ```java
  
  class Human
  {
    private String name;
    private int age;
    private String gender;
    
    // Constructor
    public Human(){
        this.name = "";
        this.age = -1;
        this.gender = "";
    }
    
    
  
    public void setName(String name){
        this.name = name;
    } 
    
    public void setAge(int age){
        this.age = age;
    }
     
    public void setGender(String gender){
        this.gender = gender;
    }
  
    public void getDetails(){
        System.out.println("Name :- "+name);
        System.out.println("Age :- "+age);
        System.out.println("Gender :- ",gender);
    }
  }
  
  public class Main
  {
    public static void main(String [] args){
        //Creating an object of class Human
        Human obj = new Human();
        obj.setAge(22);
        obj.setName("Sanket");
        obj.setGender("male");
        obj.getDetails();
        
        Human h = new Human();
        obj.getDetails();
        
        
        /*
                OUTPUT
                Name :- "Sanket"
                Age :- 22
                Gender :- "male"
                
                Name :- " "
                Age :- -1
                Gender :- " "
         */
    } 
  }
  ```
### Default Constructor vs Parameterized Constructor

```java
  
  class Human
  {
    private String name;
    private int age;
    private String gender;
    
    // Default Constructor
    public Human(){
        this.name = "";
        this.age = -1;
        this.gender = "";
    }
    
    // Parameterized Constructor
    public Human(String name,int age,String gender){
      this.name = name;
      this.age = age;
      this.gender = gender;
    }
    
  
    public void setName(String name){
        this.name = name;
    } 
    
    public void setAge(int age){
        this.age = age;
    }
     
    public void setGender(String gender){
        this.gender = gender;
    }
  
    public void getDetails(){
        System.out.println("Name :- "+name);
        System.out.println("Age :- "+age);
        System.out.println("Gender :- ",gender);
    }
  }
  
  public class Main
  {
    public static void main(String [] args){
        //Creating an object of class Human
        Human obj = new Human("Sanket",22,"male");
        obj.getDetails();
        
        Human h = new Human();
        obj.getDetails();
        
        
        /*
                OUTPUT
                Name :- "Sanket"
                Age :- 22
                Gender :- "male"
                
                Name :- " "
                Age :- -1
                Gender :- " "
         */
    } 
  }
  ```
## Anonymous Object
- We can't use Anonymous Object again (can use once);
  ```java
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
            new OOP.AccessModifiers.other.A().show();   // Anonymous Object
        }
    }

        /*
        OUTPUT

        in A show()
        */
  ```
  
## Inheritance
- To inherit properties of one class by another.

### Single Level Inheritance
- Calc.java file
  ```java
    class Calc {

        public int add(int n1, int n2){
            return n1 + n2;
        }

        public int sub(int n1 , int n2){
            return n1 - n2;
        }
    }
  ```
- AdvCalc.java file
  ```java
    class AdvCalc extends Calc{
        public int multi(int n1, int n2){
            return n1 * n2;
        }

        public int div(int n1, int n2){
            return n1/n2;
        }
    }
  ```
- Demo.java file
  ```java
  
    class Demo{
        public static void main(String[] args){
            
            AdvCalc obj = new AdvCalc();
            int r1 = obj.add(2,2);
            int r2 = obj.sub(3,2);
            int r3 = obj.multi(3,3);
            int r4 = obj.div(3 / 2);
            System.out.println("2 + 2 : "+r1);
            System.out.println("3 - 2 : "+r2);
            System.out.println("3 * 3 : "+r3);
            System.out.println("3 / 2 : "+r4);
        } 
    }
  ```
- OUTPUT
  ```java
     /* 
    
      2 + 2 : 4
      3 - 2 : 1
      3 * 3 : 9
      3 / 2 : 1
    
     */
  ```
### Multi Level Inheritance
- Calc.java file
  ```java
    class Calc {

        public int add(int n1, int n2){
            return n1 + n2;
        }

        public int sub(int n1 , int n2){
            return n1 - n2;
        }
    }
  ```
- AdvCalc.java file
  ```java
    class AdvCalc extends Calc{
        public int multi(int n1, int n2){
            return n1 * n2;
        }

        public int div(int n1, int n2){
            return n1/n2;
        }
    }
  ```
- VeryAdvCalc.java file
  ```java
    class VeryAdvCalc extends AdvCalc{
        public int power(int n1, int n2){
            return (int) Math.pow((double) n1,(double) n2);
        }
    }
  ```
- Demo.java file
  ```java
  
    class Demo{
        public static void main(String[] args){
            
            VeryAdvCalc obj = new VeryAdvCalc();
            int r1 = obj.add(2,2);
            int r2 = obj.sub(3,2);
            int r3 = obj.multi(3,3);
            int r4 = obj.div(3 / 2);
            int r5 = obj.power(2,2);
            System.out.println("2 + 2 : "+r1);
            System.out.println("3 - 2 : "+r2);
            System.out.println("3 * 3 : "+r3);
            System.out.println("3 / 2 : "+r4);
            System.out.println("2 ** 2 : "+r5);
        } 
    }
  ```
- OUTPUT
  ```java
     /* 
    
      2 + 2 : 4
      3 - 2 : 1
      3 * 3 : 9
      3 / 2 : 1
      2 ** 2 : 4
    
     */
  ```
## Super and This Methods

### Super Method
- Every constructor in java has method super() , means call the constructor of super class.
- Every base class in java extends the Object class
  ```java
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

    class B extends OOP.AccessModifiers.other.A{
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
        OOP.AccessModifiers.other.A obj3 = new OOP.AccessModifiers.other.A();

      }
    }
    
  ```
  
### This Method
- this() - Executes the constructor of same class.
  ```java
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

    class B extends OOP.AccessModifiers.other.A {
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
  ```

## Method Overriding in JAVA
- In below example the add() method of AdvCalc class overrides add() method of Calc class.
  ```java
    class Clac{

        public int add(int n1, int n2){
            return n1+n2;
        }

        public int sub(int n1,int n2){
            return n1-n2;
        }
    }

    class AdvCalc extends Clac{

        public int add(int n1, int n2){
            return n1+n2+1;
        }
    }

    public class Demo {
        public static void main(String[] args) {

            AdvCalc obj = new AdvCalc();
            int r1 = obj.add(2,3);   
            int r2 = obj.sub(3,2);   
            System.out.println(r1 +" : "+r2 );


        }   
    }

  ```
  
## Access modifiers

|       | Public | Private | Protected | Default |
| :---        |:------:|:-------:|:---------:|:-------:|
| Same Class        |   Y    |    Y    |     Y     |    Y    |
| Same package subclass    |   Y    |    N    |     Y     |    Y    |
|Same package non-subclass    |   Y    |    N    |     Y     |    Y    |
| Different package subclas   |   Y    |    N    |     Y     |    N    |
| Different packagr non-subclass   |   Y    |    N    |     N     |    N    |

- Note 
  1. Make your classes public
  2. Can't have two public classes in same file.
  3. Try to keep your instance variable private.
  4. Most of the time methods will pe public.

## Polymorphism

- "Poly" means many and "morphism" means behaviour.
- Types of Polymorphism :
  1. Complie time polymorphism (Eg. Overloading)
  2. Run time polymorphism  (Eg. Overridding)

### Dynamic Method Dispatch
- We are not sure which methos will be called

## Final Keyword
- It can be used with variable, method and class
1. Final with variable
     ```java
         public class Demo{
             public static void main(String[] args){
                 final int num = 9;
                 System.out.println(num);  // 9
             }         
         }
     ```
     - final keyword makes variable constant, it cannot be changed .
2. Final with Class
   ```java
       final class Clac{
           public void show(){
               System.out.println("in show of Calc");
           }
  
           public void add(int a , int b){
               System.out.println(a+b);
           }
       }
   ```
   - Making a class final , means no one can extend it (stopping inheritance).
3. Final with Method
   ```java
        class Clac{
            public final void show(){
                System.out.println("By Sanket");
            }
   
            public void add(int a , int b){
                System.out.println(a+b);
            }
        } 
   ```
   - By using final with method ,we stop method overriding.

## Upcasting And Downcasting

  ```java
    class A{
        public void show1(){
            System.out.println("in A show");
        }
    }

    class B extends A {
        public void show2(){
            System.out.println("in B show");
        }
    }


    public class D {
        public static void main(String[] args) {
            A obj = new B();        // Upcasting
            obj.show1();

            B obj1 = (B) obj;   // Downcasting
            obj1.show2();
        }   
    }

  ```
## Wrapper Classes
- converting a primitive data type into a wrapper object is called autoboxing.
- converting a wrapper object into primitive data type is called auto-unboxing.
  ```java
    public class Demo{
        public static void main(String [] args){
            int num1 = 9;
            Integer num = num1;    // autoboxing
            System.out.println(num);
  
            int num2 = num;
            System.out.println(num2); // auto-unboxing
        }
    }
  ```
## Abstract Keyword
1. abstract method should be in abstract class
2. An abstract class can have abstract and normal methods
3. We can't create an object of abstract class.
4. Need concreate class.

```java
    abstract class Car {
  public abstract void drive();

  public abstract void fly();

  public void playMusic() {
    System.out.println("play music");
  }
}

class BMW extends Car {
  public void drive() {
    System.out.println("driving...");
  }

  
  public void fly() {
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
```

## Inner Class
```java
    class A{
        int age;

        public void show(){
            System.out.println("in show");
        }

        class B{
            public void config(){
                System.out.println("in config");
            }   
        }
    }
    public class IC {
        public static void main(String[] args) {
            A obj = new A();
            obj.show();

            A.B obj1 = obj.new B();
            obj1.config();  
        }
    }
```

## Anonymous Inner Class
  ```java
        class A{
            public void show(){
              System.out.println("in show of A");
            }
        }
        
        public class Demo{
          public static void main(String[] args) {
                A obj = new A()
                {
                    public void show(){
                      System.out.println("in new show");
                    }
                };
                obj.show();
          }
        }
        
        /*
                Output
                
                in new show
         */
  ```

## Abstract and Inner class
```java
    abstract class A{
        public abstract void show();
        public abstract void config();
    }   
    
    public class Demo{
      public static void main(String[] args) {
        A obj = new A()
        {
            public void show(){
              System.out.println("in new show");
            }
            
            public void config(){
              System.out.println("in new config");
            }
        };
        obj.show();
        obj.config();
      }
    }
```

## Need of Interface
```java
        interface Computer{
            void code();
        }   
        class Laptop implements Computer{
            public void code(){
              System.out.println("code, compile, run");
            }
        }

        class Desktop implements Computer{
          public void code(){
            System.out.println("code, compile, run, faster");
          }
        }
        
        class Developer{
            public void devApp(Computer lap){
                lap.code();
            }
        }   

        public class Demo{
            public static void main(String [] args){
                
                Computer lap = new Laptop();
                Computer desk = new Desktop();
                
                Developer Navin = new Developer();
                navin.devApp(desk);
            }
        }

```
## Interface
```java
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

    class B implements A,X{

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
                
            Y obj = new B();
            obj.run();
            
            System.out.println(A.age);
            System.out.println(A.area);
        }
    }

```
- Interface does not has memory in heap , it is of object create of class B.
- Variables in interfaces are always static and final.
- A same class can implement more than one interface.
- One interface can inherit another interface
- NOTE:
  1. class - class --> extends
  2. class - interface --> implements
  3. interface to interface --> extends

## Enum in Java
```java
  enum Status{
    Running, Failed , Pending, Success;
  }
  
  public class Demo
  {
      public static void main(String[] args){
          Status [] ss = Status.values();
          
          for(Status s : ss){
            System.out.println(ss);
          }
            
      }
  }
```

## Types of Interfaces
- Types of Interface
  1. Normal
  2. Functional / SAM (Single Abstract Method)
  3. Marker
- ***Normal Interface*** :- The inteface with two or more method is called normal interface.
- ***Functional Interface*** :- Interface with one method is called SAM or functional Interface.
- ***Marker Interface*** :- Interface with no methods is caled Marker Interface.

## Exception Handling
- Types of Error : 
  1. Compile-time Error
  2. Runtime Error (Exceptions Handling)
  3. Logical Error

### try-catch
```java
    public class Exp {
        public static void main(String[] args) {

            int i = 12;
            int j = 0;

            try
            {
                j = 99/i;
            }
            catch(Exception e){
                System.out.println("Something went wrong");
                System.out.println("Bye");
            }

            System.out.println(i);

        }
    }
```
### try With multiple catch
```java

public class MultipleExp {
  public static void main(String[] args) {

    int i = 12 ;
    int j =0;

    String s = null;
    int nums[] = new int[5];
    try
    {
      j = 68/i;
      System.out.println(s.length());
      System.out.println(nums[2]);
      System.out.println(nums[4]);

    }
    catch(ArithmeticException e){
      System.out.println("Cannot divide by zero");
    }
    catch (IndexOutOfBoundsException e){
      System.out.println("Index is out of bound");
    }
    catch(Exception e){
      System.out.println("Something went wrong ..."+e);
    }
  }
}


```

### throw Keyword
```java
public class throwKeyword {
    public static void main(String[] args) {
        int i = 5 ;
        int j =0;


        try {
            j = 18/i;
            if (j == 0)
                throw new ArithmeticException();
        }
        catch(ArithmeticException e) {
            j = 18/1;
            System.out.println("That's the default output");
        }
        catch(Exception e){
            System.out.println("Something went wrong : "+e);
        }

        System.out.println(j);
        System.out.println("Bye");
    }



}


```

### Custom Exception
- We can make custom exception by making class of it and extending it to Exception.

```java
class MyException extends Exception{

    MyException(String str){
        super(str);
    }
}

public class CustomException {
    public static void main(String[] args) {

            int i = 100 ;
            int j =0;


            try {
                j = 18/i;
                if (j == 0)
                    throw new MyException("This is my exception..");
            }
            catch(MyException e) {
                j = 18/1;
                System.out.println("That's the default output" + e);
            }
            catch(Exception e){
                System.out.println("Something went wrong : "+e);
            }

            System.out.println(j);
            System.out.println("Bye");


    }
}

```

### Ducking the exception with throws
```java

class A {
    public void show() throws ClassNotFoundException{
        Class.forName("Calc");
    }
}
public class throwsKeyword {
    public static void main(String[] args)  {

        A obj = new A();
        try {
            obj.show();
        } catch (ClassNotFoundException e) {
            System.out.println(e);;
        }
    }
}

```
## Threads
### Multiple Threads
- Need to extend class with Thread class.
- Need to run in main with start.- Need to define run() in class extending Thread.
```java
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
    /*
  
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi  
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi
    Hi  
    Hi
    Hi
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    Hello
    */
```
### Thread Priority and Sleep
- getPriority() gives the priority of a thread.
  - Priority ranges from 1 to 10.
  - 1 is least priority.
  - 10 is the highest priority.
  - 5 is the default priority.
- setPriority() is used to set the priority of the thread.
  - We can use constant for setting the priority:- 
    - Thread.MAX_PRIORITY
    - Thread.MIN_PRIORITY
    - Thread.NORM_PRIORITY
- Thread.sleep(i) is used to make thread wait.
### Thread States
1. New State :- When we create a thread.
2. Runnable State :- When we start() a thread it goes into runnable state.
3. Running State :- thread running with help of run()
4. Waiting State :-  sleep() will take it to waiting state
5. Dead State :- When work is over.

## Collection Frameworks
<embed src="pdf/OOPS.pdf" width="600" height="500" type="application/pdf">
