package threads.schedulingmethods;

class A implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("A running");
            Thread.yield();
            // make polite request to the thread scheduler to make it as runnable state and allows fair chances to another threads also
        }
    }
}

class B implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println("B running");
            Thread.yield();
        }
    }
}

public class SchedulingMethodsExample {

    static void main() throws InterruptedException {

        Thread t1 = new Thread(new A(),"thread1");
        Thread t2 = new Thread(new B(),"thread2");

        t1.start();
        //t1.join(); // the thread that calls it have to wait until the thread got complete
        t2.start();

        Thread.sleep(1000);
        System.out.println("everything is over");

    }
}
