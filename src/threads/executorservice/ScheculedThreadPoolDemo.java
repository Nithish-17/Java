package threads.executorservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Work implements Runnable {
    @Override
    public void run() {
        System.out.println("Scheduled ExecutorService");
    }
}

public class ScheculedThreadPoolDemo {
    static void main() throws InterruptedException {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(5);
        scheduler.scheduleAtFixedRate(new Work(),1000,2000, TimeUnit.MILLISECONDS);
        //scheduler.scheduleWithFixedDelay(new Work(),1000,2000, TimeUnit.MILLISECONDS); // it does after the dealy + after completion of previous task
        Thread.sleep(5000);
        scheduler.shutdown(); //this stops the loading of tasks



    }
}
