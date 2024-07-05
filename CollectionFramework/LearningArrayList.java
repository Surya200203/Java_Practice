package CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LearningArrayList {
    public static void main(String[] args) {
        /*
        // To add elements
        ArrayList<String> sectionA = new ArrayList<>();
        sectionA.add("Rohan Mallik");
        sectionA.add("Soham Das");
        sectionA.add("Neeraj Sharma");
        System.out.println(sectionA);                // [Rohan Mallik, Soham Das, Neeraj Sharma]

        List<String> sectionB= new ArrayList<>();
        sectionB.add("Rohit Sharma");
        sectionB.add("Hardik Patil");
        sectionB.add(1,"Sahil Sathe");
        System.out.println(sectionB);               // [Rohit Sharma, Sahil Sathe, Hardik Patil]


        sectionA.addAll(sectionB);
        System.out.println(sectionA);               // [Rohan Mallik, Soham Das, Neeraj Sharma, Rohit Sharma, Sahil Sathe, Hardik Patil]

        // To get an element
        System.out.println(sectionA.get(1));        // Soham Das

        //To remove element
        sectionB.remove(1);
        System.out.println(sectionB);               // [Rohit Sharma, Hardik Patil]

        sectionA.remove(String.valueOf("Soham Das"));
        System.out.println(sectionA);               // [Rohan Mallik, Neeraj Sharma, Rohit Sharma, Sahil Sathe, Hardik Patil]

        sectionB.clear();
        sectionA.clear();
        System.out.println(sectionA);               // []
        System.out.println(sectionB);               // []
        */

        List<Integer> nums = new ArrayList<>();

        int initial = 0;
        for (int i = 0; i < 10; i++) {
           initial += 10;
           nums.add(initial);
        }
        /*
        System.out.println(nums);                   // [10, 20, 30, 40, 50, 60, 70, 80, 90, 100]

        nums.set(4,55);
        System.out.println(nums);                   // [10, 20, 30, 40, 55, 60, 70, 80, 90, 100]

        System.out.println("Did 50 is presnt in nums ? : "+nums.contains(50));      // false
        */

        // Traversing a ArrayList
        // CASE 1 : Using for loop
        System.out.println("The elements present in ArrayList nums are :- ");
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }

        // USing enhanced for loop
        System.out.println("The elements present in ArrayList nums are :- ");
        for(Integer e : nums){
            System.out.println(e);
        }

        // Using Itertor
        Iterator<Integer> it = nums.iterator();

        while(it.hasNext()){
            System.out.println("Iterator " + it.next());
        }

    }
}
