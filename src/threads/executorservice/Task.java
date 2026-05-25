package threads.executorservice;

public class Task implements Runnable {
    private final int id;
    public Task(int id) {
        this.id = id;
    }
    @Override
    public void run() {
        try {
            System.out.println("Task " + id + " started by single thread pool executor "+Thread.currentThread().getName());
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
