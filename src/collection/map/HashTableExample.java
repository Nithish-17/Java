package collection.map;

import java.util.Enumeration;
import java.util.Hashtable;

/*
        // it is a legacy map extends dictionary interface
        it is synchronized
*/

public class HashTableExample {

    static void main() {

        Hashtable<Integer, Integer> hashtable = new Hashtable<>();

        hashtable.put(1,10);
        hashtable.put(2,20);
        hashtable.put(3,30);

        Enumeration<Integer> enumeration = hashtable.elements();

        while (enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }



    }
}
