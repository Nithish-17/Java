package collection.queue;

import java.util.PriorityQueue;

/*
        Elements are processed based on priority rather than insertion order.
        Supports standard queue operations like add(), poll(), and peek().
        Automatically grows as elements are added and null insertion is not possible .
        Uses a heap data structure (min heap) internally to ensure efficient insertion and removal of the highest-priority element.
        resize similar to arraylist

        PriorityQueue<E> pq = new PriorityQueue<E>();
        PriorityQueue<E> pq = new PriorityQueue<E>(initialCapacity);
        PriorityQueue<Integer> pq = new PriorityQueue<>(comparator obj);
        PriorityQueue<E> pq = new PriorityQueue<E>(int initialCapacity, Comparator<E> comparator);


        PriorityQueue uses an array-based binary heap
        It maintains the heap property using heapify operations

                        Insert  → O(log n)
                        Delete  → O(log n)
                        Peek    → O(1)
                        Search  and other operation like remove specific element(require linear search because partially sorted),contains, update reuqires O(n)
*/

public class PriorityQueueExample{

    public static void run(){

        PriorityQueue<Integer> queue = new PriorityQueue<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add(3);


        System.out.println(queue.peek());
        System.out.println(queue.poll());

    }

}

/*
    have all functions on collection and queue
    */


