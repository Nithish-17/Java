package collections.streams.example;

import java.util.*;
import java.util.stream.*;

public class Main {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Ram", 85, "CSE"),
                new Student("Arun", 60, "ECE"),
                new Student("Kumar", 90, "CSE"),
                new Student("Ravi", 75, "EEE"),
                new Student("Ram", 85, "CSE")
        );

        // 1️⃣ FILTER + MAP + DISTINCT + SORTED + COLLECT
        List<String> names = students.stream()
                .filter(s -> s.marks > 70)
                .map(s -> s.name)
                .distinct()
                .sorted()
                .collect(Collectors.toList()); // or .toList();


        System.out.println("Top students names: " + names);


        // 2️⃣ COUNT
        long count = students.stream()
                .filter(s -> s.marks > 70)
                .count();

        System.out.println("Count >70: " + count);


        // 3️⃣ REDUCE (sum marks)
        int total = students.stream()
                .map(s -> s.marks)
                .reduce(0, (a,b) -> a+b);

        System.out.println("Total marks: " + total);


        // 4️⃣ FIND FIRST
        students.stream()
                .filter(s -> s.marks > 80)
                .findFirst()
                .ifPresent(s -> System.out.println("First >80: " + s));


        // 5️⃣ MATCH OPERATIONS
        boolean anyFail = students.stream()
                .anyMatch(s -> s.marks < 40);

        boolean allPass = students.stream()
                .allMatch(s -> s.marks >= 50);

        System.out.println("Any fail? " + anyFail);
        System.out.println("All passed? " + allPass);


        // 6️⃣ GROUPING BY (VERY IMPORTANT)
        Map<String, List<Student>> byDept =
                students.stream()
                        .collect(Collectors.groupingBy(s -> s.dept));

        System.out.println("Grouped by department:");
        System.out.println(byDept);


        // 7️⃣ LIMIT
        students.stream()
                .sorted((a,b) -> b.marks - a.marks)
                .limit(3)
                .forEach(System.out::println);

    }
}
