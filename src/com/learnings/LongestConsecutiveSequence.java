package com.learnings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    static  void methodSort(int[] array){
        if(array.length == 0)
        {
            System.out.println("The array is empty");
            return;
        }
        Arrays.sort(array);
        int count = 0;
        int maxLength = 1;
        int lastSmaller = Integer.MIN_VALUE;
        for(int i = 0; i<array.length; i++){
            if(array[i] == lastSmaller + 1){
                count++;
                lastSmaller = array[i];
            }
            else if(array[i] != lastSmaller){
                lastSmaller = array[i];
                count = 1;
            }
            maxLength = Math.max(maxLength, count);
        }
        System.out.println("The largest contiguos sequence is : " + maxLength);
    }
    static void usingSet(int[] array){
        if(array.length == 0){
            System.out.println("The array is empty");
            return;
        }
        int maxLength = 1;
        Set<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < array.length; i++){
            set.add(array[i]);
        }
        for(int value : set){
            if(!set.contains(value-1)){
                int count = 1;
                int x = value;
                while (set.contains(x+1)){
                    x++;
                    count++;
                }
                maxLength = Math.max(maxLength, count);
            }
        }
        System.out.println("The largest contiguos sequence is : " + maxLength);
    }
    static void main() {
        int[] array = {1,2,3,4,53,12,13,22,56,2,4,21,33};
        //methodSort(array);
        usingSet(array);
        return;
    }
}
