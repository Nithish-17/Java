package com.learnings;

import java.util.*;

class Practice {
    static void secondLargestElement(int[] array, int n) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++) {
            if(array[i] > largest) {
                secondLargest = largest;
                largest = array[i];
            }
            else if(array[i] > secondLargest && array[i] != largest) {
                secondLargest = array[i];
            }
        }
        System.out.println("The second Largest element is " + secondLargest);
    }
    static void rotateRight(int[] array, int k) {
        int n = array.length;
        for(int i = 0; i < k; i++){
            int last = array[n-1];
            for(int j = 1; j < n; j++) {
                array[j] = array[j-1];
            }
            array[0] = last;
        }
        System.out.println("The rotated array is " + Arrays.toString(array));
    }
    static void unionofSortedArray(int[] array1, int[] array2) {
        int n1 = array1.length, n2 = array2.length;
        List<Integer> union = new ArrayList<>();
        int i = 0, j = 0;
        while(i < n1 && j < n2) {
            if(array1[i] <= array2[j]) {
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
        while(i < n1) {
            if(union.getLast() != array1[i]) {
                union.add(array1[i]);
            }
            i++;
        }
        while (j < n2) {
            if(union.getLast() != array2[j]) {
                union.add(array2[j]);
            }
            j++;
        }
        System.out.println("The union of the elements is " + union);
    }
}

public class ArrayPractice {
   static void main() {
//       int[] array = {1,2,3,4,5};
//       int n = array.length;
//       //Practice.secondLargestElement(array, n);
//       //Practice.rotateRight(array, 3);
//       Practice.unionofSortedArray(new int[] {1,1,2,3,3,4,4,5}, new int[] {2,3,4,4,5,6,7});
         int[] sorting = {1,4,1,3,6,4};
       Arrays.sort(sorting);
       System.out.println(Arrays.toString(sorting));

    }
}
