package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionsExample {
    static void main() {
        List<Integer> list = new ArrayList<>();
        list.addFirst(10);
        System.out.println(list.getFirst());
        Iterator<Integer> it = list.iterator();
        while(it.hasNext())
                System.out.println(it.next());
    }
}
