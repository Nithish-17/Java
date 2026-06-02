package collection.queue;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListQueueExample {

    public static void run(){

        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        System.out.println(queue.peek());
        System.out.println(queue.poll());

    }

    /*
    */
}
