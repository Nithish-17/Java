package threads.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPoolExecutorDemo {
    static void main() {
        try(ExecutorService fixed = Executors.newFixedThreadPool(2)) {
            for(int i = 0; i < 10; i++) {
                fixed.execute(new Task(i));
            }
        }
    }
}
