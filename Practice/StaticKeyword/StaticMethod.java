package StaticKeyword;


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
