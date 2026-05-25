package threads.executorservice;

import java.util.concurrent.*;

class TestCallable implements Callable<Integer> {
    private final int id;
    public TestCallable(int id) {
        this.id = id;
    }

    @Override
    public Integer call() throws Exception {
        System.out.println("Callable is going to return the id");
        return id;
    }
}
public class CallableDemo {
    static void main() throws ExecutionException, InterruptedException, TimeoutException {
        Future<Integer> val = null;
        try (ExecutorService call = Executors.newSingleThreadExecutor()) {
                val = call.submit(new TestCallable(12));
        }
        //System.out.println(val.get()); // make the main thread wait until val gets value
        System.out.println(val.get(5000,TimeUnit.MILLISECONDS));
    }
}
