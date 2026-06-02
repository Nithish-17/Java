package collection.queue;

import java.util.concurrent.DelayQueue;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;


class Task implements Delayed{

    private String name;
    private long startTime;

    public Task(String name, long delayMillis) {
        this.name = name;
        this.startTime = System.currentTimeMillis() + delayMillis;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        long diff = startTime - System.currentTimeMillis();
        return unit.convert(diff, TimeUnit.MILLISECONDS);
    }

    @Override
    public int compareTo(Delayed other) {
        return Long.compare(
                this.getDelay(TimeUnit.MILLISECONDS),
                other.getDelay(TimeUnit.MILLISECONDS)
        );
    }

    @Override
    public String toString() {
        return name;
    }
}

public class DelayQueueExample {
    static void main() throws InterruptedException {

        DelayQueue<Task> queue = new DelayQueue<>();

        queue.put(new Task("Task 1", 5000)); // 5 sec
        queue.put(new Task("Task 2", 2000)); // 2 sec

        System.out.println("Waiting...");

        System.out.println(queue.take()); // Task 2 after ~2 sec
        System.out.println(queue.take()); // Task 1 after ~5 sec
    }
}
