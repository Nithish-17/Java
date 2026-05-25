package com.learnings;

import java.util.Arrays;
import java.util.Scanner;

public class Sort {

   static void selectionSort(int[] array,int n) {
       for(int i = 0; i < n-1; i++) {
           int min = i;
           for(int j = i+1; j < n; j++) {
               if(array[j]<array[min]) {
                   min = j;
               }
               }
           if(min != i) {
               int temp = array[i];
               array[i] = array[min];
               array[min] = temp;
           }
       }
   }
   static void bubbleSort(int[] array,int n) {
       for(int i = 0; i < n; i++) {
           boolean isSwap = false;
           for(int j = 0; j < n-i-1; j++) {
               if(array[j]>array[j+1]) {
                   int temp = array[j];
                   array[j] = array[j+1];
                   array[j+1] = temp;
                   isSwap = true;
               }
           }
           if(!isSwap) break;
       }
   }
   static void insertionSort(int[] array,int n) {
       for(int i = 0; i < n; i++) {
           int j = i;
           while(j > 0 && array[j-1] > array[j]) {
               int temp = array[j];
               array[j] = array[j-1];
               array[j-1] = temp;
               j--;
           }
       }
   }
   static void merge(int l, int m, int r, int[] array) {
       int[] temp = new int[r-l+1];
       int i = l, j = m+1, k = 0;
       while(i <= m && j <= r) {
           if(array[i] <= array[j])
               temp[k++] = array[i++];
           else
               temp[k++] = array[j++];
       }

       while(i <= m)                    // leftovers on left side array
           temp[k++] = array[i++];

       while (j <= r)                   // leftovers on right side array
           temp[k++] = array[j++];

       for(int x = 0; x < temp.length; x++) {
           array[l+x] = temp[x];
       }

   }
   static void mergeSort(int l,int r,int[] array) {
       if(l>=r) return;
       int m =  l+(r-l)/2;
       mergeSort(l,m,array);
       mergeSort(m+1,r,array);
       merge(l,m,r,array);
   }
   static void recursivebubbleSort(int[] array,int n) {
       if(n == 1) return;
       for(int j = 0; j < n - 1; j++) {
           if(array[j]>array[j+1]) {
               int temp = array[j];
               array[j] = array[j+1];
               array[j+1] = temp;
           }
       }
       recursivebubbleSort(array,n-1);
   }
   static void recursiveinsertionSort(int[] array,int n) {
       if(n == 1) return;
       recursiveinsertionSort(array,n-1);
       int j = n-1;
       while(j > 0 && array[j-1] > array[j]) {
           int temp = array[j];
           array[j] = array[j-1];
           array[j-1] = temp;
           j--;
       }
   }
   static int partition(int[] array, int low, int high) {
       int i = low, j = high;
       int  pivot = array[low];
       while(i < j) {
           while(array[i] <= pivot && i < high)
               i++;
           while(array[j] > pivot)
               j--;
           if(i < j) {
               int temp = array[i];
               array[i] = array[j];
               array[j] = temp;
           }
       }
       array[low] = array[j];
       array[j] = pivot;



       return j;
   }
   static void quickSort(int[] array, int l, int r) {
            if(l < r) {
                int p  = partition(array, l, r);
                quickSort(array, l, p-1);
                quickSort(array, p+1, r);
            }
   }

    static void main() {
       int[] array = {5,3,1,4,2};
       int n = array.length;
       Scanner sc = new Scanner(System.in);
       System.out.println("1:Selection Sort\n2:Bubble Sort\n3:Insertion Sort\n4:Merge Sort\n" +
               "5:recursiveBubbleSort\n6:recursiveinsertionSort\n7:quickSort");
       int option = sc.nextInt();
        switch (option) {
            case 1 -> selectionSort(array, n);
            case 2 -> bubbleSort(array, n);
            case 3 -> insertionSort(array, n);
            case 4 -> mergeSort(0, n - 1, array);
            case 5 -> recursivebubbleSort(array, n);
            case 6 -> recursiveinsertionSort(array, n);
            case 7 -> quickSort(array, 0, n - 1);

        }
       selectionSort(array,n);
       bubbleSort(array,n);
       insertionSort(array,n);
       mergeSort(0,n-1,array);
       System.out.println(Arrays.toString(array));
       return;

    }
}
