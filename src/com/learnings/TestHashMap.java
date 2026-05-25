package com.learnings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TestHashMap {
   public static void main(String[] args) {
       Map<Integer,Integer> map = new HashMap<>();
       Scanner sc = new Scanner(System.in);
       while(true){
           System.out.print("Enter the value or -1 to exit : ");
           int key = sc.nextInt();
           if(key == -1) break;
           map.put(key,map.getOrDefault(key,0)+1);
       }
       if(map.isEmpty()) return;

       int max_key = 0, min_key = 0;
       int max_count = Integer.MIN_VALUE, min_count = Integer.MAX_VALUE;
       for(Map.Entry<Integer,Integer> entry : map.entrySet()){
           if(entry.getValue() > max_count){
               max_count = entry.getValue();
               max_key = entry.getKey();
           }
           if(entry.getValue() < min_count) {
               min_count = entry.getValue();
               min_key = entry.getKey();
           }
       }

       System.out.println(min_key + "has minimum count of " + min_count);
       System.out.println(max_key + "has maximum count of " + max_count);
    }
}
