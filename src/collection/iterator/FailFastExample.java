package collection.iterator;

import java.util.ArrayList;
import java.util.Iterator;


// fail fast is stopping system when it detects a problem

public class FailFastExample {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> iterator = list.iterator();

        while (iterator.hasNext()) {
            String value = iterator.next();

            // Modifying collection directly during iteration
            if (value.equals("B")) {
                list.add("D"); // Causes ConcurrentModificationException
            }

            System.out.println(value);
        }
    }
}
