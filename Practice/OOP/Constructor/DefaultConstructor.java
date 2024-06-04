package OOP.Constructor;

class Car{
    private String brand;
    private String color;
    private int petrolCapacity;

    // Default Constructor

    public Car(){
        this.brand = "";
        this.color ="";
        this.petrolCapacity = 0;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public void setColor(String color){
        this.color = color;
    }
    public void setPetrolCapacity(int petrolCapacity){
        this.petrolCapacity = petrolCapacity;
    }
    public void getDetailsOfCar(){
        System.out.println("Car Details are as below :-");
        System.out.println("1. Brand : "+brand);
        System.out.println("2. Colour : "+color);
        System.out.println("3. Petrol Capacity : "+ petrolCapacity);
    }
}

public class DefaultConstructor {

    public static void main(String[] args) {

        Car c1 = new Car();
        c1.setBrand("hyundai");
        c1.setColor("white");
        c1.setPetrolCapacity(50);
        c1.getDetailsOfCar();

        Car c2 = new Car();
        c2.getDetailsOfCar();
    }
}
