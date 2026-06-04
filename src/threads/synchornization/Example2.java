package threads.synchornization;

public class Example2 {
    int  count = 0;
    void increment() {
        synchronized (this) {
            count++;
        }
    }
    public static void main(String[] args) {

        Example2 example2 = new Example2();

        Thread one = new Thread(() -> {
            for (int i = 0; i < 10000; i++)
                example2.increment();
        });
        Thread two = new Thread(() -> {
            for (int i = 0; i < 10000; i++)
                example2.increment();
        });

        one.start();
        two.start();
        try{
            one.join();
            two.join();
        }
        catch (InterruptedException e){
            System.out.println();
        }
        System.out.println(example2.count);
    }
}
