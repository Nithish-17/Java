package collection.iterator;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;


//A fail-safe iterator works on a copy of the collection, so modifications do not cause exceptions.

/*
----------------------------Common Fail-Safe Collections Summary--------------------------
            ----------------------------------------
            |Collection	                Type        |
            |---------------------------------------|
            |CopyOnWriteArrayList	    List        |
            |CopyOnWriteArraySet	    Set         |
            |ConcurrentHashMap	        Map         |
            |ConcurrentSkipListMap	    Sorted Map  |
            |ConcurrentSkipListSet	    Sorted Set  |
            -----------------------------------------
*/

public class FailSafeExample {
    public static void main(String[] args) {

        CopyOnWriteArrayList<String> list =
                new CopyOnWriteArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String value = iterator.next();

            if (value.equals("B")) {
                list.add("D"); // No exception
            }

            System.out.println(value);
        }

        System.out.println(list);
    }
}
