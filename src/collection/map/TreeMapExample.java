package collection.map;

/*
    TreeMap internally uses a Red-Black Tree for efficient sorting.
    sorts only keys
    Provides O(log n) time for insertion, deletion and lookup due to its self-balancing Red-Black Tree structure.
    TreeMap does not allow null keys, but allows null values.
*/

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapExample {

    static void main() {

        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(2,"world");
        map.put(1,"hello");
        map.put(3,"three");
        map.put(4,"four");
        map.put(5,"five");

        Map<Integer, String> taillllMap = map.tailMap(2, true);

        for(Map.Entry<Integer,String> mpp : taillllMap.entrySet()){

            System.out.println(mpp.getKey()+" "+mpp.getValue());

        }

        map.subMap(2, true, 5, false).forEach((k,v)->System.out.println(k+" "+v));




    }
}
