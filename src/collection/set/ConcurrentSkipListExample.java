package collection.set;


import java.util.concurrent.ConcurrentSkipListSet;

/*
    internally uses ConcurrentSkipListMap
            ✔ Sorted Set
            ✔ Thread-safe
            ✔ Based on Skip List (NOT Tree / Hash)

        Level 3:      10 ----------- 40 ----------- 70
        Level 2:      10 ---- 20 ---- 40 ---- 60 ---- 70
        Level 1:      10 -- 15 -- 20 -- 30 -- 40 -- 60 -- 70
        Level 0:      10  15  20  30  40  60  70

        acts like binary search for each level

        total time complexity is O(log n) same as TreeSet

        have same functions as TreeSet
*/
public class ConcurrentSkipListExample {

    public static void run(){

        ConcurrentSkipListSet<Integer> set = new ConcurrentSkipListSet<>();

    }
}
