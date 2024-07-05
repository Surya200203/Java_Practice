package CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearningPriorityQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();

        // Adding an elements
        pq.offer(12);
        pq.offer(32);
        pq.offer(2);
        pq.offer(1);

        System.out.println(pq);     // [1, 2, 12, 32]

        // removing elements
        pq.poll();
        System.out.println(pq);     // [2, 12, 32]

        System.out.println(pq.peek());  // 2

        // To chnage the pirority we use comparator

        PriorityQueue<Integer> newPq = new PriorityQueue<>(Comparator.reverseOrder());
        newPq.offer(2);
        newPq.offer(23);
        newPq.offer(1);
        System.out.println(newPq);      // [23, 2, 1]


    }
}
