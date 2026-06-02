package collection.set;

import java.util.TreeSet;


/*
    unique elements in a sorted order.
    It is part of java.util package that implements the SortedSet interface
    internally uses TreeMap which uses Red-Black tree to maintain sorting.
    Does not allow null elements because it uses comparison for sorting, which causes NullPointerException.
    Implements the NavigableSet interface and provides navigation methods like
            higher(),
            lower(),
            ceiling()
            floor().
    It is not synchronized. it must be synchronized using Collections.synchronizedSet().

    1. Using inorder traversing

            add()      O(log n)
            contains() O(log n)
            remove()   O(log n)



     doesn't have any load factor the constructors were
     TreeSet<> ts = new TreeSet<>();
     TreeSet <> ts = new TreeSet<>(comp); // with comparator object creation
     TreeSet <> t = new TreeSet<>(col);  // with collection
     TreeSet <> t = new TreeSet<>(s); // SortedSet ---- already sorted set
    */

public class TreeSetExample {

    public static void run() {


        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(1);
        treeSet.add(3);
        treeSet.add(5);
        treeSet.add(4);

        treeSet.forEach(System.out::println);

    }

    /*
        Sorted Set is needed to provide the extra functions that are needed for a ordered set

        | Method                               | Return Type           | Purpose                                                  |
| ------------------------------------ | --------------------- | -------------------------------------------------------- |
| `first()`                            | E                     | Returns the smallest (lowest) element                    |
| `last()`                             | E                     | Returns the largest (highest) element                    |
| `headSet(E toElement)`               | SortedSet<E>          | Elements strictly less than `toElement`              |
| `tailSet(E fromElement)`             | SortedSet<E>          | Elements greater than or equal to `fromElement`      |
| `subSet(E fromElement, E toElement)` | SortedSet<E>          | Elements in range `[fromElement, toElement)`             |
| `comparator()`                       | Comparator<? super E> | Returns custom comparator or `null` for natural ordering |

also addFirst(), addLast() -- basically does add() and removeFirst() and removeLast()


NavigableSet was introduced because SortedSet was too limited.
SortedSet can only do basic things:

            ✔ first element
            ✔ last element
            ✔ range view (subset)

            But it cannot answer important “navigation” questions like:

            What is just smaller than X?
            What is just greater than X?
            What is closest value to X?
            Can I traverse in reverse order?


    | Method                 | Meaning                  | Example (set = [10,20,30,40,50]) |
| ---------------------- | ------------------------ | -------------------------------- |
| `lower(E e)`           | greatest element < e     | `lower(30)` → 20                 |
| `floor(E e)`           | greatest element ≤ e     | `floor(30)` → 30                 |
| `higher(E e)`          | smallest element > e     | `higher(30)` → 40                |
| `ceiling(E e)`         | smallest element ≥ e     | `ceiling(30)` → 30               |
| `pollFirst()`          | remove + return smallest | returns 10                       |
| `pollLast()`           | remove + return largest  | returns 50                       |
| `descendingSet()`      | reverse view             | [50,40,30,20,10]                 |
| `descendingIterator()` | reverse iteration        | 50 → 10                          |
| headSet()
| tailSet()
| subSet()
|

    */
}
