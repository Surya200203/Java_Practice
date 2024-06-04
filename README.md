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

## Type Converstio and Casting
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
- + --> Addition
- - --> Subtraction
- / --> Division (gives quotent)
- % --> Modulo (gives remainder)
- num++ --> Post Increment (assigns and then increment's the value)
- num-- --> Post Decrement (assigns and then decrement's the value)
- ++num --> Pre Increment (increment's and then assigns the value)
- --num --> Pre Decerement (decrement's and then assigns the value)

## Relational Operators
- < --> Less than
- > --> Greather than
- = --> Assignment opertor
- == --> Equals to
- <= --> Less than  Equal to
- >= --> Greater tha Equal to
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


