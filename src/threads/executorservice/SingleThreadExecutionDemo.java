package threads.executorservice;

import java.util.concurrent.*;

public class SingleThreadExecutionDemo {

    public static void main(String[] args) {
        int input;
        try (ExecutorService single = Executors.newSingleThreadExecutor()){
            for (int i = 0; i < 10; i++) {
                //single.execute(new Task(i));
                Future<?> container = single.submit(new Task(i));
                container.get(); // ------ makes main thread wait until the tasks for the single thread executor does
            }
        }
        catch (InterruptedException e) {
            System.out.println("interrupted");
        }

        // we can use the future object to block the main thread, make interrupts, checks completions...
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }

    }
}
