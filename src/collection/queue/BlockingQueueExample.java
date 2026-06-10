package collection.queue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;

/*
        Supports blocking methods like put() and take().
        Thread-safe, so no explicit synchronization is required.
        Does not allow null elements.



        mostly used on problems like producer - consumer

        1.LinkedBlockingQueue(Bounded and optional unbounded)
        2.ArrayBlockingQueue(Bounded only)
        3.LinkedBlockingDeque(double ended queue optionally bounded)
        4.DelayQueue --- explanation at last----
        5.LinkedPriorityQueue --- extension of priority queue with put and take
        6.SynchronousQueue ---  doesn't have internal storage (direct handoff b/w threads)

*/

public class BlockingQueueExample {

    public static void run(){

        BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
    }
}

/*| Method                                              | Description                                                              |
| --------------------------------------------------- | ------------------------------------------------------------------------ |
| `put(E e)`                                          | Inserts an element, **waits if the queue is full**                       |
| `take()`                                            | Removes and returns the head, **waits if the queue is empty**            |
| `offer(E e, long timeout, TimeUnit unit)`           | Tries to insert, waits up to the specified time if full                  |
| `poll(long timeout, TimeUnit unit)`                 | Tries to remove, waits up to the specified time if empty                 |
| `remainingCapacity()`                               | Returns how many more elements can be inserted without blocking          |
| `drainTo(Collection<? super E> c)`                  | Removes all available elements and adds them to another collection       |
| `drainTo(Collection<? super E> c, int maxElements)` | Removes up to `maxElements` elements and adds them to another collection |
*/



/*
 DelayQueue is a specialized implementation of a blocking queue that orders elements based on their delay time.
  Only elements whose delay has expired can be retrieved from the queue.
  If the delay has not expired, the consumer thread attempting to retrieve the element will be blocked until the delay expires.
  It is unbounded
  uses heap
    */