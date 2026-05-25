package threads.interthreadcommunication;

import java.util.ArrayList;
import java.util.List;

public class ProducerandConsumer {
    List<Integer> list = new ArrayList<Integer>();
    private final int top = 5;
    private int sequence = 0;

    private final Object lock = new Object();
    private void producer(){
        synchronized (lock) {
        while(true){
            if(list.size() == top){
                try {
                    System.out.println("producer is full waiting for consume........");
                    lock.wait();
                } catch(InterruptedException e) {
                    System.out.println(e.getMessage());
                }
            }
            else{
                System.out.println("produced "+sequence);
                list.add(sequence++);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                lock.notify();
            }
        }
        }
    }

    private void consumer() {
        synchronized (lock) {
            while(true){
                if(list.isEmpty()){
                    System.out.println("nothing to consume waiting to produce........");
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else {
                    System.out.println("consumed "+list.getFirst());
                    list.removeFirst();
                    lock.notify();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        }
    }

    static void main() {
        ProducerandConsumer p = new ProducerandConsumer();
        Thread one = new Thread(p::producer);
        Thread two = new Thread(p::consumer);
        one.start();
        two.start();
    }
}
