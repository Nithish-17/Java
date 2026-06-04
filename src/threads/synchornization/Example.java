package threads.synchornization;

public class Example {
    private static int count = 0;
    static synchronized void increment() {
        count++;

    }
    static void main() {
        Thread one = new Thread(() -> {
            for (int i = 0; i < 10000; i++) increment();
        });
        Thread two = new Thread(() -> {
            for (int i = 0; i < 10000; i++) increment();
        });
        one.start();
        two.start();

        try {
            one.join();
            two.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        /* expected output be 20000
        threads one and two loads the variable at same time and perform operation the value was updated wronly
                1.load
                2.perform operations
                3.store
         */
        System.out.println(count);

    }
}
