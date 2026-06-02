package collection.list;


/*
    1. Maintains insertion order
    2. Allows duplicate elements
    3. Supports bidirectional traversal using ListIterator
*/


/*
    some lists implement RandomAccess Interface it is a marker interface(holds nothing) to tell jvm to directly access the index instead of searching linearly
    Eg : ArrayList, Vector
*/


import java.util.concurrent.CopyOnWriteArrayList;

public class Main {
    public static void main(String[] args) {



        ArrayListExample.run();
        LinkedListExample.run();
        StackExample.run();

    }
}

/*
| Type                 | Class                | Thread-safe | Modifiable     | Use case               |
| -------------------- | -------------------- | ----------- | -------------- | ---------------------- |
| ArrayList            | ArrayList            | ❌           | ✅              | General use            |
| LinkedList           | LinkedList           | ❌           | ✅              | Frequent insert/delete |
| Vector               | Vector               | ✅           | ✅              | Legacy                 |
| Stack                | Stack                | ✅           | ✅ (but legacy) | LIFO                   |
| CopyOnWriteArrayList | CopyOnWriteArrayList | ✅           | ⚠️ slow writes   | Concurrent reads       | //fail safe
| Arrays.asList        | Arrays utility       | ❌           | fixed-size      | quick wrapper          |
| List.of              | Factory method       | ❌           | ❌              | immutable lists        |
| synchronizedList     | wrapper              | ✅           | depends         | thread-safe wrapper    |

 */
