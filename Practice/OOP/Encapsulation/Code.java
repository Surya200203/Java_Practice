package OOP.Encapsulation;

class Human{
    private String name;
    private int age ;
    private String gender ;

    public void setDetails(String n,int a,String g){
        name = n;
        age = a;
        gender =g;
    }

    public void getDetails(){
        System.out.println("Name : -"+ name);
        System.out.println("Age : -"+ age);
        System.out.println("Gender : -"+ gender);

    }

}


public class Code {

    public static void main(String[] args) {
        Human obj = new Human();
        obj.setDetails("Sanket",22,"male");
        obj.getDetails();

    }

}
