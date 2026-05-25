package threads.executorservice;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CachedThreadPoolDemo {
    static void main() {
        //dynamic
        try (ExecutorService dynamic = Executors.newCachedThreadPool()) {
            for(int i = 0; i < 100; i++) {
                dynamic.execute(new Task(i));
            }
        }
    }
}
