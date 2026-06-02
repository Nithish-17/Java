package collection.set;

/*
        HashSet does not allow duplicate elements.
        but it can have a null
        Uses HashMap internally which is an implementation of hash table data structure.
        Also implements Serializable and Cloneable interfaces.
        HashSet is not thread-safe. To make it thread-safe, synchronization is needed externally.
        so fail fast


        ----Capacity of HashSet----
        Capacity refers to the number of buckets in the hash table. The default capacity of a HashSet is 16 and the load factor is 0.75.
        When the number of elements exceeds the threshold, the capacity automatically increases
        new capacity = old capacity × 2

        HashSet internally uses a hash table (via HashMap)


        4 ways to create Hash Set
            1. HashSet<String> set = new HashSet<>();
            2. HashSet<Type> set = new HashSet<>( initialCapacity);
            3. HashSet<Type> set = new HashSet<>( initialCapacity, loadFactor);
            4. HashSet<Type> set = new HashSet<>(c);
*/


import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

    public static void run() {

        Set<Integer> set = new HashSet<>();

        set.add(1);
        set.add(2);
        set.add(3);
        set.add(3);

        set.forEach(System.out::println);



    }
}

/*
    add()
	remove()
	contains()
	size()
	isEmpty()
	clear()
	addAll()
	removeAll()
	retainAll()
    iterator()
	forEach()
	toArray()
	equals()
	hashCode()
	spliterator()
    */
