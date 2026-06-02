package collection.iterator;

import java.util.*;


/*
* we are learning Iterator given by Iterable class
* has 3 function
*               1-hasNext()
*               2-next()
*               3-remove()
*               4-forEachRemaining()
*
*
* ----------other Iterators-----------------
* 1.List Iterator
*           ---specially for all lists supports backward traversals also------
*           1.hasNext()
*           2.next()
*           3.hasPrevious()
*           4.previous()
*           5.add()
*           6.set() -- modify the element
*           7.remove()
*
* 2.descendingIterator() --- function that only for linked list, TreeSet, TreeMap iterates from reverse
*               have same functions as Iterator
*
* 3.SplitIterator()
*
*
* */

public class IteratorExample {
    static void main() {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);


        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            if(it.next() == 3){
                it.remove();
                break;
            }
        }

        //process remaining elements after hasNext() pointer breaks
        it.forEachRemaining(System.out::print);
        System.out.println();



        list.add(3);
        ListIterator<Integer> it2 = list.listIterator();
        while(it2.hasNext()){

            if(it2.next() > 1) {
                System.out.print(it2.previous());
                it2.next();
            }

        }
    }
}
