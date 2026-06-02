package collection.list;

/*

It implements a doubly linked list where elements are stored as nodes containing data and references to the previous and next nodes, rather than in contiguous memory locations.
LinkedList is not thread-safe by default; it can be synchronized using Collections.synchronizedList().
Provides better performance than ArrayList for insertion and deletion operations, especially at the beginning or middle.

has stack functions also from deque interface

implements List and Deque

LinkedList class implements List, Cloneable, and Serializable interfaces.

LinkedList extends AbstractSequentialList which extends AbstractList interface why?
--becuase all other list was RandomAccessable but linked list is sequential--- so that internally use list iterator
*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void run() {

        LinkedList<Integer> example = new LinkedList<>();

        for(int i = 0; i < 5; i++) {
            example.add(i);
        }

        System.out.println("LinkedListExample");

        Iterator<Integer> iterator = example.descendingIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }


   /*
     * Methods Unique to LinkedList (Compared to ArrayList)
     *
     * Method                                  Purpose
     * ---------------------------------------------------------------
     * addFirst(E e)                           Insert at beginning (add|get|remove)First | Last will be for all list
     * addLast(E e)                            Insert at end
     * descendingIterator()                    Reverse traversal // Deque interface function
     * element()                               Get head element
     * getFirst()                              Get first element
     * getLast()                               Get last element
     * offer(E e)                              Add as queue tail
     * offerFirst(E e)                         Add at front
    * offerLast(E e)                          Add at end
    * peek()                                  View head without removing
    * peekFirst()                             View first element
    * peekLast()                              View last element
    * poll()                                  Remove head
    * pollFirst()                             Remove first
    * pollLast()                              Remove last
    * pop()                                   Stack pop
    * push(E e)                               Stack push
    * remove()                                Remove head
    * removeFirst()                           Remove first element
    * removeFirstOccurrence(Object o)         Remove first matching occurrence
    * removeLast()                            Remove last element
    * removeLastOccurrence(Object o)          Remove last matching occurrence
    */


    /*
            Operation                   ArrayList         LinkedList

            Access (get by index)	    O(1)	            O(n)
            Search (contains)	        O(n)	            O(n)
            Insert at end	            O(1) amortized	    O(1)
            Insert at beginning	        O(n)	            O(1)
            Insert in middle	        O(n)	            O(n) (but different reason)
            Delete at end	            O(1)	            O(1)
            Delete at beginning	        O(n)	            O(1)
            Delete in middle	        O(n)	            O(n)
*/

}
