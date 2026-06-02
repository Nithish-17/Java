package collection.queue;

import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.TransferQueue;


/*
designed for handoff-style communication between producer and consumer threads.

It extends BlockingQueue, but adds a key feature:
        👉 A producer can wait until a consumer actually receives the element.
*/

public class LinkedTransferQueueExample {

    public static void run() throws InterruptedException {

        TransferQueue<String> queue = new LinkedTransferQueue<>();

        // -------------------------
        // Consumer thread
        // -------------------------
        Thread consumer = new Thread(() -> {
            try {
                System.out.println("Consumer waiting...");
                String item = queue.take(); // waits for item
                System.out.println("Consumer received: " + item);
            } catch (Exception e) {}
        });

        consumer.start();

        // Give consumer time to start waiting
        Thread.sleep(1000);

        // -------------------------
        // 1. tryTransfer (immediate attempt)
        // -------------------------
        boolean result1 = queue.tryTransfer("A");
        System.out.println("tryTransfer result: " + result1);

        // -------------------------
        // 2. transfer (blocking until consumer gets it)
        // -------------------------
        Thread producer2 = new Thread(() -> {
            try {
                System.out.println("Calling transfer...");
                queue.transfer("B");
                System.out.println("transfer completed");
            } catch (Exception e) {}
        });

        producer2.start();

        Thread.sleep(500);

        // -------------------------
        // 3. check waiting consumer
        // -------------------------
        System.out.println("Has waiting consumer? " + queue.hasWaitingConsumer());

        System.out.println("Waiting consumer count: " + queue.getWaitingConsumerCount());

    }
}

/*
    | Method                                          | Return Type | What it does                                     | Behavior                                                              |
    | ----------------------------------------------- | ----------- | ------------------------------------------------ | --------------------------------------------------------------------- |
    | `transfer(E e)`                                 | `void`      | Transfers element directly to a waiting consumer | ⛔ Blocks producer until consumer takes the element                    |
    | `tryTransfer(E e)`                              | `boolean`   | Tries to transfer immediately                    | ✅ Returns `true` if a consumer was already waiting, otherwise `false` |
    | `tryTransfer(E e, long timeout, TimeUnit unit)` | `boolean`   | Tries to transfer, waits up to timeout           | ⏳ Waits for consumer, returns `true` if successful                    |
    | `hasWaitingConsumer()`                          | `boolean`   | Checks if any consumer is waiting                | 🔍 Returns `true` if at least one consumer is blocked on `take()`     |
    | `getWaitingConsumerCount()`                     | `int`       | Approximate number of waiting consumers          | 📊 Returns number of consumers waiting                                |

*/