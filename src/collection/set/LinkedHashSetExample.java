package collection.set;

/*
    it is same as hash set all were remains the same the time complexity and functions
    the diff is internally it has doubly linked list every element is connected to each other for insertion order

     Internal Structure:

        LinkedHashMap
            =
        Hash Table
            +
        Doubly Linked List


     while iterating over all it holds the insertion order
*/

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void run() {

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(5);


        Iterator<Integer> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
