package collection.queue;

public class Main {

    /*
        Elements follow FIFO (First-In-First-Out) in LinkedList and priority order in PriorityQueue
        Elements cannot be accessed directly using an index
        Allows storing duplicate elements
*/

    public static void main(String[] args) throws InterruptedException {

        PriorityQueueExample.run();
        ArrayDequeExample.run();
        LinkedTransferQueueExample.run();
    }



    /* Queue interface functions
            | Method       | Return Type | Purpose               | Behavior on failure       |
        | ------------ | ----------- | --------------------- | ------------------------- |
        | `add(E e)`   | boolean     | Insert element        | Throws exception          |
        | `offer(E e)` | boolean     | Insert element safely | Returns `false`           |
        | `remove()`   | E           | Remove head           | Throws exception if empty |
        | `poll()`     | E           | Remove head safely    | Returns `null` if empty   |
        | `element()`  | E           | View head             | Throws exception if empty |
        | `peek()`     | E           | View head safely      | Returns `null` if empty   |
    */



    /* Dequeue interface functions
    | Category           | Method                 | Description             | Exception / Safe       |
| ------------------ | ---------------------- | ----------------------- | ---------------------- |
| **Insert Front**   | `addFirst(E e)`        | Insert at front         | Exception if fails     |
|                    | `offerFirst(E e)`      | Insert at front safely  | Returns false if fails |
| **Insert Rear**    | `addLast(E e)`         | Insert at rear          | Exception if fails     |
|                    | `offerLast(E e)`       | Insert at rear safely   | Returns false if fails |
| **Remove Front**   | `removeFirst()`        | Remove front element    | Exception if empty     |
|                    | `pollFirst()`          | Remove front safely     | Returns null if empty  |
| **Remove Rear**    | `removeLast()`         | Remove rear element     | Exception if empty     |
|                    | `pollLast()`           | Remove rear safely      | Returns null if empty  |
| **Access Front**   | `getFirst()`           | Get front element       | Exception if empty     |
|                    | `peekFirst()`          | Get front safely        | Returns null if empty  |
| **Access Rear**    | `getLast()`            | Get rear element        | Exception if empty     |
|                    | `peekLast()`           | Get rear safely         | Returns null if empty  |
| **Stack Ops**      | `push(E e)`            | Insert at front (LIFO)  | Same as addFirst       |
|                    | `pop()`                | Remove from front       | Same as removeFirst    |
| **Queue Ops**      | `offer(E e)`           | Insert at rear (FIFO)   | Same as offerLast      |
|                    | `poll()`               | Remove from front       | Same as pollFirst      |
|                    | `peek()`               | View front              | Same as peekFirst      |
| **Collection Ops** | `size()`               | Number of elements      | —                      |
|                    | `isEmpty()`            | Check empty             | —                      |
|                    | `contains(Object o)`   | Check element exists    | —                      |
|                    | `iterator()`           | Forward iteration       | —                      |
|                    | `descendingIterator()` | Reverse iteration       | —                      |
|                    | `toArray()`            | Convert to array        | —                      |
|                    | `remove(Object o)`     | Remove specific element | —                      |
|                    | `clear()`              | Remove all elements     | —                      |
|                    | `forEach()`            | Lambda iteration        | —                      |
|                    | `spliterator()`        | Parallel iteration      | —                      |

    * */
}
