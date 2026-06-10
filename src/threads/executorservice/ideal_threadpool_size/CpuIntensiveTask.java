package threads.executorservice.ideal_threadpool_size;

//creating too much thread beyond the cpu threads limit will do performance degradation due to context switching

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class CpuTask implements Runnable{

    @Override
    public void run() {
        System.out.println("this process is handled by " + Thread.currentThread().getName());
    }
}

public class CpuIntensiveTask {

    public static void main(String[] args) {

        int cores = Runtime.getRuntime().availableProcessors(); // returns no of logical cores that os allocates to the jvm

        System.out.println("no of cores present in my device is " + cores);

        try(ExecutorService service = Executors.newFixedThreadPool(cores)) {


            for(int i=0; i<20; i++)
                service.execute(new CpuTask());

        }
    }
}
