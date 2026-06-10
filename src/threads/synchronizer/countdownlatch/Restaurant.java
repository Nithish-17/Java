package threads.synchronizer.countdownlatch;

import java.util.concurrent.CountDownLatch;

public class Restaurant {

    public static void main(String[] args) throws InterruptedException {

        int totalChefs = 3;
        CountDownLatch latch = new CountDownLatch(totalChefs);

        new Thread(new Chef("vikram","curd rice",latch)).start();
        new Thread(new Chef("logesh","pasta",latch)).start();
        new Thread(new Chef("hari","noodles",latch)).start();

        latch.await(); // blocks the main thread until the countdown becomes0

        System.out.println("all chefs are prepared the food and ready to serve");



    }
}


class Chef implements Runnable{

    private final String name;
    private final String food;
    private final CountDownLatch latch;

    Chef(String name, String food, CountDownLatch latch) {
        this.name = name;
        this.food = food;
        this.latch = latch;
    }

    @Override
    public void run() {

        System.out.printf("The chef %s is preparing the %s\n",name,food);
        latch.countDown(); // reduce the countdown by 1
        System.out.printf("the chef %s prepared %s\n",name,food);

    }
}
