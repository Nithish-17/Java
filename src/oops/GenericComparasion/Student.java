package oops.GenericComparasion;

public class Student implements Comparable<Student> {
    int roll_no;
    int mark;

    public Student(int roll_no, int mark) {
        this.roll_no = roll_no;
        this.mark = mark;
    }
    @Override
    public int compareTo(Student o) {
        System.out.println("comparing " + this.roll_no + " " + o.roll_no);
        return this.mark - o.mark;
    }
    @Override
    public String toString() {
        return roll_no + " " + mark;
    }
}
