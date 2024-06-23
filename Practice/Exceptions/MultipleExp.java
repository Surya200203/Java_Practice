package Exceptions;

public class MultipleExp {
    public static void main(String[] args) {

        int i = 12 ;
        int j =0;

        String s = null;
        int nums[] = new int[5];
        try
        {
            j = 68/i;
            System.out.println(s.length());
            System.out.println(nums[2]);
            System.out.println(nums[4]);

        }
        catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch (IndexOutOfBoundsException e){
            System.out.println("Index is out of bound");
        }
        catch(Exception e){
            System.out.println("Something went wrong ..."+e);
        }
    }
}
