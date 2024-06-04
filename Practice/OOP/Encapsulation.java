package OPP;

class Human{

    // when uses privete method only methoda inside that class can access them.
    //binding our data with data with methods
    private String name = "Sahil";
    private int age = 21;

    public void setAge(int a){
        age = a;
    }

    public void setName(String n){
        name = n;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }


}

class Encapsulation{
    public static void main(String[] args) {
        Human obj = new Human();
        obj.setAge(21);
        obj.setName("Sahil");

        System.out.println(obj.getName()+" has age :- "+obj.getAge());
    }

}