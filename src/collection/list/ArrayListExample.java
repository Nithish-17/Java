package collection.list;

import java.util.*;

/*
   internally using object array
    ArrayList is not thread-safe to make Collections.synchronizedList()
    Eg : List<String> syn_list = Collections.synchronizedList(list);


    ArrayList constructor has 3 types
            1. ArrayList()
            2. ArrayList(Collection<? extends E> c)
            3. ArrayList(int initialCapacity)


     Default capacity is 10
     New Capacity = Old Capacity + (Old Capacity / 2)
     Element Shifting on Insert/Delete
     Index-Based Access

     stores base address
     address = base address + (index x size of each element)


     Time complexity

     1. Inserting Element in ArrayList at the end    -   O(1)
     2. Inserting Element at specific index          -   O(N)
     3. Removing an elements                         -   O(N)
     4. Replacing Elements                           -   O(1)
     5. Traversing any element                       -   O(1)


     it is fail fast

     ArrayList class implements List, RandomAccess, Cloneable, and Serializable interfaces.


*/

public class ArrayListExample {

    public static void run() {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.remove(Integer.valueOf(5));
        list.remove(0); // list.removeFirst()


        list.add(0,1);

        list.forEach(System.out::println);

        System.out.println(list.getFirst());
    }
}



/*

1.  add(int index, Object element)          -- Inserts the element at the given index and shifts remaining elements to the right.
2.  add(Object o)                           -- Appends the element to the end of the ArrayList.
4.  addAll(Collection C)                    -- Appends all elements from the given collection to the end of the list.
5.  addAll(int index, Collection C)         -- Inserts all elements from the collection starting at the given index.
6.  clear()                                 -- Removes all elements from the list.
7.  clone()                                 -- Returns a shallow copy of the ArrayList.
8.  contains(Object o)                      -- Returns true if the list contains the given element.
9.  ensureCapacity(int minCapacity)         -- Increases capacity if needed to hold at least the given number of elements.
10. forEach(Consumer action)                -- Performs the given action for each element in the list.
11. get(int index)                          -- Returns the element at the given index.
12. indexOf(Object o)                       -- Returns the first index of the element, or -1 if it is not found.
13. isEmpty()                               -- Returns true if the list has no elements.
14. lastIndexOf(Object o)                   -- Returns the last index of the element, or -1 if it is not found.
15. listIterator()                          -- Returns a ListIterator over the elements in proper sequence.
16. listIterator(int index)                 -- Returns a ListIterator starting from the given index.
17. remove(int index)                       -- Removes the element at the given index.
18. remove(Object o)                        -- Removes the first occurrence of the given element if it is present.
19. removeAll(Collection c)                 -- Removes all elements that are also present in the given collection.
20. removeIf(Predicate filter)              -- Removes all elements that satisfy the given predicate.
21. removeRange(int fromIndex, int toIndex) -- Removes elements from fromIndex inclusive to toIndex exclusive.
22. retainAll(Collection<?> c)              -- Keeps only the elements that are present in the given collection.
23. set(int index, E element)               -- Replaces the element at the given index with the given element.
24. size()                                  -- Returns the number of elements in the list.
25. spliterator()                           -- Creates a late-binding and fail-fast Spliterator over the list.
26. subList(int fromIndex, int toIndex)     -- Returns a view from fromIndex inclusive to toIndex exclusive.
27. toArray()                               -- Returns an array containing all elements in proper order.
28. toArray(Object[] o)                     -- Returns an array containing all elements in the runtime type of the given array.
29. trimToSize()                            -- Trims the capacity of the ArrayList to the current size.
30. replaceAll(UnaryOperator operator)      -- Replaces each element with the result of applying the operator.
31. sort(Comparator c)                      -- Sorts the list using the given comparator.
*/
