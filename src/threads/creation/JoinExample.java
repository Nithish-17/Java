package threads.creation;

public class JoinExample {
    static void main() {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("first");
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <= 10; i++) {
                System.out.println("second");
            }
        });

        Thread mainThread = Thread.currentThread();
        Thread t3 = new Thread(mainThread::interrupt);// crated to make interrupt for main waited by t1 and t2
        t1.start();
        t2.start();
        t3.start();
        try {
            t1.join(); // main thread called this so it will wait until t1 completes
            t2.join();// main waits until t2 finishes
            // also have timed join(100)
        } catch (InterruptedException e) {
            System.out.println("main thread interrupted");;
        }
        System.out.println("program terminated");

    }
}
