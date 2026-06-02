package oops.comparator_and_comparable;

import java.util.*;

class Person {

    String name;
    int age;

    public Person(String name, int age) {

        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {

        return this.name + " " + this.age;
    }
}

class NameComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.name.compareTo(o2.name);
    }
}

class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
    }
}

public class ComparatorExample {

    public static void main(String[] args) {

        Person person1 = new Person("beck", 18);
        Person person2 = new Person("anne", 18);
        Person person3 = new Person("anna", 18);

        List<Person> persons = new ArrayList<>();
        persons.addAll(Arrays.asList(person1, person2, person3));

        Collections.sort(persons, new NameComparator());

        // ---------- or ------------------

        Collections.sort(persons,(a,b) -> a.name.compareTo(b.name));

        persons.forEach(System.out::println);

    }

}
