package Array;

public class Array1 {

    public static void main(String[] args) {
        int num[] = { 5, 6, 7 };
        int num1[] = new int[4]; // Dynamically creates a array with all element as zeros [0,0,0,0]

        System.out.println(num[0]); // 5
        System.out.println(num[1]); // 6
        System.out.println(num[2]); // 7

        num[1] = 3; // change value

        for(int i=0; i< num.length;i++){
            System.out.println(num[i]);
        }
    }
    
}
