package com.learnings;

class Student {
    String name;
    int age;
    static int population;
    static{
        System.out.println("this is static block");
    }
    static void printname(Student s) {
        System.out.println(s.name);
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        population++;
    }
}

public class Oops {
    public static void main(String[] args) {
    Student s1;
//    Student s1 = new Student("Nithiesh", 20);
//        Student s2 = new Student("Varun", 20);
//
//        System.out.println(Student.population);
//        Student.printname(s1);
    }
}
