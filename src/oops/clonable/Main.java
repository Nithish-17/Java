package oops.clonable;

import java.util.*;

public class Main {
    static void main() throws CloneNotSupportedException {
        Student s = new Student(10);
        Student s1 = new Student(s);
        System.out.println(s.array == s1.array); // both have same address;--shallow copy
        s.array[0] = 100;
        System.out.println(Arrays.toString(s.array));
        System.out.println(Arrays.toString(s1.array));

        Student s2 = (Student) s.clone();
        System.out.println(Arrays.toString(s2.array));

    }
}
