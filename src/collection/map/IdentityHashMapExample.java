package collection.map;

import java.util.IdentityHashMap;


/*
        compares keys using == instead of equals()
        Uses System.identityHashCode() for hashing
        Allows multiple keys with same content but different references


        unlike hash map it uses a flat array
                          table
            --------------------------------
            | key1 | value1 | key2 | value2 |
            --------------------------------

            --------------------(OR)----------------

            TABLE (Flat array)
                    index
                    -------------------------------------------------
                    0  | key1
                    1  | value1
                    2  | key2
                    3  | value2
                    4  | key3
                    5  | value3
                    -------------------------------------------------


        Example after:

                map.put(a, 1);
                map.put(b, 2);

                the internal table might look like:

                -----------------------------------------
                | a | 1 | b | 2 | null | null | ...
                -----------------------------------------


                    | Operation  | Time Complexity |
                    | ---------- | --------------- |
                    | `put()`    | O(1) average    |
                    | `get()`    | O(1) average    |
                    | `remove()` | O(1) average    |
                    | Worst case | O(n)            |


                    generates index with the System.identityHashCode() then place it on the array if already other element found on the index then it will linear probe to find the empty slot thats why O(n) worst case serach

*/

public class IdentityHashMapExample {

    static void main() {

        IdentityHashMap<String,Integer> map = new IdentityHashMap<>();

        map.put(new String("one"),1);
        map.put(new String("one"),2);

        map.forEach((s,i) -> System.out.println(s));
    }
}
