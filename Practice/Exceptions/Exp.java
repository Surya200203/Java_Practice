package Exceptions;



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
