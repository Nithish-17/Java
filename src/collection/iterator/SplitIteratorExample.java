package collection.iterator;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

/*
* almost all collections have split iterator
* it is basically used for parallel processing of collections by splitting them
*
* */
public class SplitIteratorExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.add(i);
        }

        Spliterator<Integer> spliterator = list.spliterator();

        Spliterator<Integer> spliterator1 = spliterator.trySplit();

        spliterator.forEachRemaining(System.out::println);
        spliterator1.forEachRemaining(System.out::println);

    }
}
