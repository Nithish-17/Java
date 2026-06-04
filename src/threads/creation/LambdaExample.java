package threads.creation;

public class LambdaExample {

    static void main() throws InterruptedException {

        Thread t1 = new Thread(() -> {
            System.out.println("thread is running");
        });

        t1.start();

        Thread.sleep(1000);

    }
}
