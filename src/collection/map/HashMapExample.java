package collection.map;

import java.util.HashMap;
import java.util.Map;


/*
    O(1) ---- for all operations

    HashMap is not thread-safe, to make it synchronized, use Collections.synchronizedMap().

    HashMap allows one null key and multiple null values. If a null key is added multiple times, it overwrites the previous value.

    LinkedHashMap maintains insertion order because it has nodes connected

    WeakHashMap -- keys are weakly referenced, so entries can disappear automatically when the key is no longer strongly reachable elsewhere.

    ConcurrentHashMap -- uses CAS, Synchronization..... to allow concurrency

        new LinkedHashMap<>(16, 0.75f, true);
            true → access order (LRU cache style)
            recently accessed entries move to end
*/

public class HashMapExample {

    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("one", 1);
        map.put("two", 2);
        map.put("three", 3);




        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());

        }

    }
}

/*
                    TABLE (Array of Buckets)
                            index
                            -------------------------------------------------
                            0   | null
                            1   | null
                            2   | [A] → [C]
                            3   | null
                            4   | [B]
                            5   | null
                            -------------------------------------------------

                            here a,c,b are node

                            Node {
                                  int hash
                                  key
                                  value
                                  next → (collision chain)
                                }
*/
