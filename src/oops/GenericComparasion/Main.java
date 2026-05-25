package oops.GenericComparasion;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student nithiesh = new Student(12,95);
        Student varun = new Student(53,100);
        Student varshini = new Student(52,98);
        Student Sundu = new Student(1,99);
        Student[] names = {nithiesh,varun,varshini,Sundu};
        Arrays.sort(names);
//        if(varshini.compareTo(nithiesh) > 0){
//            System.out.println("varshini is topper");
//        }
        System.out.println(Arrays.toString(names));
        ArrayList <Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        Operation<Integer> sum = Integer::sum;
        Operation<Integer> sub = (a,b) -> a-b;
        Operation<Integer> mul = (a,b) -> a*b;
        Operation<Integer> div = (a,b) -> a/b;
        System.out.println(sum.operation(2,3));
        System.out.println(sub.operation(2,3));
        System.out.println(mul.operation(2,3));
        System.out.println(div.operation(2,3));

    }
}
