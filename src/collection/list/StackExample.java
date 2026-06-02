package collection.list;

/*
     Stack extends Vector
     Stack methods are synchronized.
     Stack class implements List, RandomAccess, Cloneable, and Serializable interfaces.
     we can use all methods from Vector

     have 5 extra methods, but it is designed only to use this 5 methods
                 1. empty()
                 2. peek()
                 3. pop()
                 4. push(element)
                 5. search(element)
*/

import java.util.Stack;

public class StackExample {
    public static void run(){

        System.out.println("Stack example");

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        stack.pop();

        System.out.println(stack.peek());

    }
}

