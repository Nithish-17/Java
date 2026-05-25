package oops.clonable;

public class Student implements Cloneable{
    int age;
    int[] array;

    Student(int age) {
        this.age = age;
        array = new int[]{1,2,3,4,5,6,7,8,9,10};
    }

    Student(Student obj){ // shallow copy --------------- manual cloing
        this.age = obj.age;
        this.array = obj.array;
    }
//    @Override
//    public Object clone() throws CloneNotSupportedException { // --- shallow copy
//        return super.clone();
//    }


    @Override
    public Object clone() throws CloneNotSupportedException { // deep copy -- internal objects manual cloning
        Student s = (Student) super.clone();
        s.array = array.clone();
        return s;
    }
}
