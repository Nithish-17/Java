package com.learnings;

import java.util.Arrays;
import java.util.Scanner;

class New{

}
public class Anagram {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String one =  sc.nextLine();
        System.out.print("Enter the second word: ");
        String two = sc.nextLine();
        if(one.length() != two.length()){
            System.out.println("Invalid");
            return;
        }
        char[] oneArray = one.toCharArray();
        char[] twoArray = two.toCharArray();
        Arrays.sort(oneArray);
        Arrays.sort(twoArray);
        if(Arrays.equals(oneArray, twoArray)){
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
