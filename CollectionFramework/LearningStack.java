package CollectionFramework;

import java.util.*;

public class LearningStack {
    public static void main(String[] args) {


        // Create a stack
        Stack<String> animals = new Stack<>();

        // Adding element in stack
        animals.push("Lion");
        animals.push("Tiger");
        animals.push("Horse");
        animals.push("Cat");
        System.out.println(animals);            // [Lion, Tiger, Horse, Cat]

        // To get top element of an stack
        System.out.println(animals.peek());     // Cat

        // To pop an element
        animals.pop();
        System.out.println(animals);            // [Lion, Tiger, Horse]
        System.out.println(animals.peek());     // Horse




    }
}
