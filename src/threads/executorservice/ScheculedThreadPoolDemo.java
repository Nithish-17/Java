package threads.executorservice;

import java.util.concurrent.*;

class Work implements Runnable {
    @Override
    public void run() {
        System.out.println("Scheduled ExecutorService");
    }
}

public class ScheculedThreadPoolDemo {
    public static void main() throws InterruptedException {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(5);
        //scheduler.schedule(new Work(),1000,TimeUnit.MILLISECONDS); schedule one time after the fixed delay
        scheduler.scheduleAtFixedRate(new Work(),1000,2000, TimeUnit.MILLISECONDS);
        //scheduler.scheduleWithFixedDelay(new Work(),1000,2000, TimeUnit.MILLISECONDS); // it does after the dealy + after completion of previous task
        Thread.sleep(5000);
        scheduler.shutdown(); //this stops the loading of tasks
        scheduler.close();



    }
}
