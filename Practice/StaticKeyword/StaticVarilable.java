package StaticKeyword;


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
        Mobile.name = "mobile";

        Mobile m2 = new Mobile();

        m2.brand = "Samsung";
        m2.price = 80000;




        m.show();
        m2.show();

        /*
            OUTPUT
            Apple -120000 -mobile
            Samsung -80000 -mobile
        */

    }
}
