package com.learnings;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayUnion {
    public static void main(String[] args) {
        int[] array1 = {1,1,2,3,4};
        int[] array2 = {2,2,3,4,4,5,6};
        int n = array1.length;
        int m = array2.length;
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (array1[i] <= array2[j]) {
                if(union.isEmpty() || union.getLast() != array1[i]) {
                    union.add(array1[i]);
                }
                i++;
            }
            else if(array2[j] < array1[i]) {
                if(union.isEmpty() || union.getLast() != array2[j]) {
                    union.add(array2[j]);
                }
                j++;
            }
        }
        while(i < n){
            if(union.getLast() != array1[i]) {
                union.add(array1[i]);
            }
            i++;
        }

        while(j < m){
            if(union.getLast() != array2[j]) {
                union.add(array2[j]);
            }
            j++;
        }
        System.out.println("The union array is " + union);
    }
}
