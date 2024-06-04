package OOP.Inheritance;

public class Demo {

    public static void main(String[] args) {

        VeryAdvCalc obj = new VeryAdvCalc();
        int r1 = obj.add(2, 3);
        int r2 = obj.sub(3, 2);
        int r3 = obj.multi(3, 2);
        int r4 = obj.div(3, 2);
        int r5 = obj.power(2,2);
        System.out.println("2 + 3 : " + r1);
        System.out.println("3 - 2 : " + r2);
        System.out.println("3 * 2 : " + r3);
        System.out.println("3 / 2 : " + r4);
        System.out.println("2 ** 2 : " + r5);
    }
}
