package collections.streams.example;

class Student {
    String name;
    int marks;
    String dept;

    Student(String name, int marks, String dept) {
        this.name = name;
        this.marks = marks;
        this.dept = dept;
    }

    public String toString() {
        return name + " " + marks + " " + dept;
    }
}
