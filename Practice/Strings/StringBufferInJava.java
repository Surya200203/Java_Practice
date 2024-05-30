package Strings;

public class StringBufferInJava {

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // 16

        StringBuffer sb2 = new StringBuffer("Sanket");
        System.out.println(sb2.capacity()); // 22

        sb2.append(" Suryavanshi");
        System.out.println(sb2);    // "Sanket Suryavanshi"
        System.out.println(sb2.length());   // 18
        System.out.println(sb2.capacity()); // 22

        sb2.append(" is learning Java");
        System.out.println(sb2);    // "Sanket Suryavanshi is learning Java"
        System.out.println(sb2.length());   // 35
        System.out.println(sb2.capacity()); // 46


        // To convert Stringbuffer to String
        String str =  sb2.toString();
        System.out.println(str);
        System.out.println(str.length()); //35

    }
}
