package threads.creation;

 class one extends Thread {
    public void run() {
        System.out.println("this is thread "+Thread.currentThread().getName());
    }
}

public class ThreadClass {
    static void main() {
        Thread t1 = new one();
        t1.start();
        System.out.println(Thread.currentThread().getState());
    }
}

