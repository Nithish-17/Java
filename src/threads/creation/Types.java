package threads.creation;

/*
Two typse of threas
        1.user
        2.deamon
1.user - main, user created threads runs the program lines then terminates after completion

2.deamon - Daemon threads run in the background and support user threads.
        Example : Garbage Collector (GC)
                  Background services
                  Monitoring threads
*/


class DaemonThread extends Thread {
    @Override
    public void run() {
        for(int i=0; i<1000; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("deamon has to run 1000 times");

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class UserThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("user ended");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
public class Types {
    static void main() {
        Thread t1 = new DaemonThread();
        Thread t2 = new UserThread();
        t1.setDaemon(true);
        t1.start();
        t2.start();
        System.out.println("main ended");
    }
}
