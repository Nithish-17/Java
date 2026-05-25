package threads.interthreadcommunication;

public class NotifyallDemo {
    private final Object lock = new Object();
    void waiting() throws InterruptedException {
        synchronized (lock) {
        lock.wait();
        System.out.println(Thread.currentThread().getName() + "resumed");
        }
    }
    void resume() {
        synchronized (lock) {
        lock.notifyAll();
        }
    }

    static void main() throws InterruptedException {
        NotifyallDemo demo = new NotifyallDemo();
        Thread one =  new Thread(()-> {
            try {
                demo.waiting();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread two =  new Thread(()-> {
            try {
                demo.waiting();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread three =  new Thread(()-> {
            try {
                demo.waiting();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        one.start();
        two.start();
        three.start();
        Thread.sleep(500);
        Thread four =  new Thread(demo::resume);
        four.start();

    }
}
