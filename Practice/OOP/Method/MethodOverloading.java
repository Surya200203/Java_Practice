package OOP.Method;


class Calculator1 {

        public int add(int num1, int num2) {
            return num1 + num2;
        }

        public double add(double num1, int num2) {
            return num1 + num2;
        }

        public int add(int num1, int num2, int num3) {
            return num1 + num2 + num3;
        }
    }

public class MethodOverloading {

        public static void main(String[] args) {


            Calculator1 obj1 = new Calculator1();


            int res1 = obj1.add(2, 3);
            int res2 = obj1.add(1, 2, 3);
            double res3 = obj1.add(2.56, 3);

            System.out.println("Addition of 2 and 3 is " + res1);
            System.out.println("Addition of 1,2 and 3 is " + res2);
            System.out.println("Addition of 2.56 and 3 is " + res3);
        }

    }

