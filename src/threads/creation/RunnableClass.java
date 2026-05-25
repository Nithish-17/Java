package threads.creation;


class A implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("A");
        }
    }
}

class B implements Runnable {
    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("B");
        }
    }
}


public class RunnableClass {
    static void main() throws InterruptedException {
        Thread t1 = new Thread(new A());
        Thread t2 = new Thread(new B(),"second"); // passing name
        Thread t3 = new Thread("three");
        t1.start();
        t2.start();
        Thread.sleep(1000);
        System.out.println(t2.isAlive());
        System.out.println(t2.getName()); // we can get the thread name before termination
        //volatile
    }
}
