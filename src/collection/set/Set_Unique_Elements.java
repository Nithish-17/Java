package collection.set;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Student {

    @Override
    public String toString() {
        return name + " " + age;
    }

    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);

        //objects is a helper class
    }
}



public class Set_Unique_Elements {

    static void main() {

        Set<Student> students = new HashSet<>();
        students.add(new Student("Nithiesh",21));
        students.add(new Student("Nithiesh",21));

        System.out.println(students);


        /*
        equals() alone can compare objects correctly, but it would be slow for large collections.
        suppose if a hashset already containing 1 millions objects then we have to compare new obj with every objects which is time leading


        hashCode() is used to make searching and duplicate checking fast.
        java internally makes buckets to put the objects by hashcode for direct lookup by generating hashcode if a object present at the bucket then already present object
        */
    }
}
