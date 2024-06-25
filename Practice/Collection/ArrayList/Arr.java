package Collection.ArrayList;

import java.util.ArrayList;
import java.util.Collection;

/*

Collection ----> List, Queue , Set (These are all interfaces ) ----> ArrayList/Linklist , Dequeue , Hashset/ Linked Hash Set (These are classes)




*/

public class Arr {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(3);

        System.out.println(nums);

        System.out.println("The following are elements of array list :- ");
        for(int n : nums){
            System.out.println(n);
        }
    }
}
