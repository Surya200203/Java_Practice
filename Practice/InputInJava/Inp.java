package InputInJava;
import java.io.BufferedReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Inp {
    public static void main(String[] args) {
//        int num = 0;
//        System.out.println("Enter a number");
//        try {
//            num = System.in.read(); // Gives ASCII value
//        }catch (IOException e){
//            System.out.println(e);
//        }
//        System.out.println(num);

    // BUFFER READER
        System.out.println("Enter a number");

        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);

        int num = 0;
        try {
            num = Integer.parseInt(bf.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(num);

        try {
            bf.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
