package StaticKeyword;

class Mobile2{

    String brand;
    int price;
    static String name;

    // Static block to initialize stratic variable
    // Ststic block is called once
    static{
        name = "mobile";
        System.out.println("In static block");
    }

    public Mobile2(){
        brand = "";
        price = 200;

    }

    public void show(){
        System.out.println(brand+" -"+price+" -"+name);
    }
}

public class StaticBlock{
    public static void main(String[] args) throws ClassNotFoundException {
        

        Class.forName("Mobile2");
        // Mobile2 m = new Mobile2();

        // m.brand = "Apple";
        // m.price = 120000;
        
        // m.show();

        
    }

}