package collection.comparator_and_comparable;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student> {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Student o) {
        return  this.name.compareTo(o.name);
    }


    @Override
    public String toString() {
        return this.name + " " + this.age;
    }
}

public class ComparableExample {

    static void main() {

        Student s1 = new Student("Nithiesh",21);
        Student s2 = new Student("Varun",21);

        List<Student> list = new ArrayList<>();
        list.add(s2); list.add(s1);

        Collections.sort(list);

        list.forEach(System.out::println);

        Collections.sort(list);

    }
}
