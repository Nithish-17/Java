package oops.records;

import java.util.Objects;

//class Student{
//    private final int age;
//    private final String name;
//
//    public Student(int age, String name) {
//        this.age = age;
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (o == null || getClass() != o.getClass()) return false;
//        Student student = (Student) o;
//        return age == student.age && Objects.equals(name, student.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(age, name);
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "age=" + age +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}

record Student(int age,String name){
    //we can have static variables and functions

//    Student(int age,String name){ -- canonical constructor
//        this.age=age;
//        this.name=name;
//    }

    Student{                         //compact canonical constructor
        if(age < 18){
            throw new IllegalArgumentException("age is below 18");
        }
    }
    void print(){
        System.out.println("Student age is: " + age);
        System.out.println("Student name is: " + name);
    }
}

public class Main {
    static void main() {
    Student s1 = new Student(1, "John");
    Student s2 = new Student(1, "John");
    System.out.println(s1.equals(s2));
    }
}
