package collection.set;

/*
    The set interface does not allow duplicate elements.
    It doesn't use contiguous index format like list so elements are not guaranteed to preserve order
    It can contain at most one null value except TreeSet implementation which does not allow null.
    The set interface provides efficient search, insertion, and deletion operations.
        -- because overall average time complexity is O(1)
            worst is O(n) if all elements goes on a same bucket
*/

public class Main {
    public static void main(String[] args) {

       /* HashSetExample.run();
        LinkedHashSetExample.run();*/
        TreeSetExample.run();


    }
}

/*
            | Core Methods (All Sets) |
                    | ----------------------- |
                    |          add()          |
                    |          remove()       |
                    |          contains()     |
                    |          size()         |
                    |          isEmpty()      |
                    |          clear()        |
                    |          iterator()     |
                    |          addAll()       |
                    |          removeAll()    |
                    |          retainAll()    |
*/


/*

    CopyOnWriteArraySet --- which works on copy of set then replace original (useful on concurrent reads and write cases reads original modifies copy)
*/
