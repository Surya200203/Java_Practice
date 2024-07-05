package CollectionFramework;

import java.util.*;

public class LearningQueueLinkedList {
    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();

        // Adding an element in queue
        queue.offer(12);
        queue.offer(24);
        queue.offer(23);

        System.out.println(queue);

        // Deleting element
        queue.poll();
        System.out.println(queue);

        // Extracting an element by peek

        System.out.println(queue.peek());

    }
}
