package threads.interthreadcommunication;

/*
wait()
notify()                -- are object class function
notifyAll()
*/

public class WaitandNotifyDemo {

    private final Object lock = new Object();
    void Waiting() throws InterruptedException {
        synchronized(lock){
            System.out.println("1:waiting");
            lock.wait();
            System.out.println("4.i resumed..........");
        }
    }

    void resuming() {
        synchronized(lock){
            System.out.println("2:from method resuming");
            lock.notify();
            System.out.println("3.notify called but i will woke one random thread after i complete");
        }
    }

    static void main()  {
        WaitandNotifyDemo demo = new WaitandNotifyDemo();
        Thread one = new Thread(()-> {
            try {
                demo.Waiting();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread two = new Thread(demo::resuming);
        one.start();
        two.start();
    }
}
